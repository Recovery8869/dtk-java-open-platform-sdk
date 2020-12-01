package com.dtk.api.http;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dtk api: HttpClientConfig
 *
 * @author 1
 * @date 2020/11/10 11:37
 */
@Configuration
public class HttpClientConfig {
    /**
     * 最大连接数
     */
    private static final Integer MAX_TOTAL = 200;
    /**
     * 每个路由最大连接
     */
    private static final Integer DEFAULT_MAX_PER_ROUTE = 200;
    /**
     * 连接超时 5秒
     */
    private static final Integer CONNECT_TIMEOUT = 5000;
    /**
     * 从 httpclient 资源池获取httpclient 最多等待5000毫秒
     */
    private static final Integer CONNECTION_REQUEST_TIMEOUT = 5000;
    /**
     * 读取超时 10秒
     */
    private static final Integer SOCKET_TIMEOUT = 10000;
    /**
     * 连接闲置2分钟后需要重新检测
     */
    private static final int VALIDATE_AFTER_INACTIVITY = 120000;

    /**
     * 首先实例化一个连接池管理器，设置最大连接数、并发连接数
     *
     * @return PoolingHttpClientConnectionManager
     */
    @Bean(name = "httpClientConnectionManager")
    public PoolingHttpClientConnectionManager getHttpClientConnectionManager() {
        PoolingHttpClientConnectionManager httpClientConnectionManager = new PoolingHttpClientConnectionManager();
        //最大连接数
        httpClientConnectionManager.setMaxTotal(MAX_TOTAL);
        //并发数
        httpClientConnectionManager.setDefaultMaxPerRoute(DEFAULT_MAX_PER_ROUTE);
        httpClientConnectionManager.setValidateAfterInactivity(VALIDATE_AFTER_INACTIVITY);
        return httpClientConnectionManager;
    }

    /**
     * 实例化连接池，设置连接池管理器。
     * 这里需要以参数形式注入上面实例化的连接池管理器
     *
     * @param httpClientConnectionManager PoolingHttpClientConnectionManager
     * @return HttpClientBuilder
     */
    @Bean(name = "httpClientBuilder")
    public HttpClientBuilder getHttpClientBuilder(@Qualifier("httpClientConnectionManager") PoolingHttpClientConnectionManager httpClientConnectionManager) {
        //HttpClientBuilder中的构造方法被protected修饰，所以这里不能直接使用new来实例化一个HttpClientBuilder，可以使用HttpClientBuilder提供的静态方法create()来获取HttpClientBuilder对象
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.setConnectionManager(httpClientConnectionManager);
        return httpClientBuilder;
    }

    /**
     * 注入连接池，用于获取httpClient
     *
     * @param httpClientBuilder HttpClientBuilder
     * @return CloseableHttpClient
     */
    @Bean
    public CloseableHttpClient getCloseableHttpClient(@Qualifier("httpClientBuilder") HttpClientBuilder httpClientBuilder) {
        return httpClientBuilder.build();
    }

    /**
     * Builder是RequestConfig的一个内部类
     * 通过RequestConfig的custom方法来获取到一个Builder对象
     * 设置builder的连接信息
     * 这里还可以设置proxy，cookieSpec等属性。有需要的话可以在此设置
     *
     * @return RequestConfig.Builder
     */
    @Bean(name = "builder")
    public RequestConfig.Builder getBuilder() {
        RequestConfig.Builder builder = RequestConfig.custom();
        return builder.setConnectTimeout(CONNECT_TIMEOUT)
                .setConnectionRequestTimeout(CONNECTION_REQUEST_TIMEOUT)
                .setSocketTimeout(SOCKET_TIMEOUT);
    }

    /**
     * 使用builder构建一个RequestConfig对象
     *
     * @param builder builder
     * @return RequestConfig
     */
    @Bean
    public RequestConfig getRequestConfig(@Qualifier("builder") RequestConfig.Builder builder) {
        return builder.build();
    }
}
