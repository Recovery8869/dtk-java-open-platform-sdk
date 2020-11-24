package com.dtk.api.http;

import lombok.Data;

/**
 * dtk api: HttpResult
 *
 * @author 1
 * @date 2020/11/10 11:37
 */
@Data
public class HttpResult {
    private Integer code;
    private String body;

    public HttpResult() {
        super();
    }

    public HttpResult(Integer code, String body) {
        super();
        this.code = code;
        this.body = body;
    }
}
