package com.dtk.api.controller.base;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.client.DtkClient;
import com.dtk.api.utils.Assert;
import com.dtk.api.constant.DtkApiConstant;
import com.dtk.api.exception.DtkResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * dtk api: base controller
 *
 * @author baige
 * @date 2020/11/13 14:21
 */
@Component
public class BaseController {
    @Autowired
    private HttpServletRequest request;
    private DtkApiClient instance;
    // private static final String DOMAIN = "https://openapi.haojiequ.com/java_op_test";
    private static final String DOMAIN = "https://openapi.dataoke.com";

    protected DtkClient getDtkClient() {
        String appKey = getClientHeader(DtkApiConstant.RequestCommonParam.APP_KEY);
        Assert.notBank(appKey, DtkResultEnum.APP_KEY_EMPTY);
        String appSecret = getClientHeader(DtkApiConstant.RequestCommonParam.APP_SECRET);
        Assert.notBank(appSecret, DtkResultEnum.APP_SECRET_EMPTY);
        if (instance == null) {
            synchronized (BaseController.class) {
                if (instance == null) {
                    this.instance = DtkApiClient.getInstance(appKey, appSecret);
                }
            }
        }

        return this.instance;
    }

    /**
     * 从header获取appKey和appSecret
     */
    private String getClientHeader(String headerKey) {
        return request.getHeader(headerKey);
    }

    protected String getRequestUrl() {
        String requestUrl = request.getRequestURI();
        return String.format("%s%s", DOMAIN, requestUrl);
    }
}
