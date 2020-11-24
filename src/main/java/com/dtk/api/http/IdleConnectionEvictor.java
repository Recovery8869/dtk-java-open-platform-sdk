package com.dtk.api.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.HttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * dtk api: idle http connection evictor
 *
 * @author 1
 * @date 2020/11/12 16:59
 */
@Component
@Slf4j
public class IdleConnectionEvictor extends Thread {
    @Autowired
    private HttpClientConnectionManager connMgr;

    private volatile boolean shutdown;

    public IdleConnectionEvictor() {
        super();
        super.start();
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(5000);
                    // 关闭失效的连接
                    connMgr.closeExpiredConnections();
                    connMgr.closeIdleConnections(30L, TimeUnit.SECONDS);
                }
            }
        } catch (InterruptedException ex) {
            // 结束
            log.error(ex.getMessage(), ex);
        }
    }


    /**
     * 关闭清理无效连接的线程
     */
    public void shutdown() {
        shutdown = true;
        synchronized (this) {
            notifyAll();
        }
    }
}
