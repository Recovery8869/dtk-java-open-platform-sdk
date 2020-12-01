package com.dtk.api.response.mastertool;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 官方活动会场转链响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:12
 */
@Getter
@Setter
public class DtkActivityLinkResponse {
    private String page_name;
    private String click_url;
    @JsonProperty("Tpwd")
    private String Tpwd;
    private String longTpwd;
    private String terminal_type;
    private String page_start_time;
    private String page_end_time;
}
