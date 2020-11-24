package com.dtk.api.response.mastertool;

import lombok.Getter;
import lombok.Setter;

/**
 * 三合一红包接口响应结果实体
 *
 * @author 1
 * @date 2020/11/11 15:51
 */
@Getter
@Setter
public class DtkMergeRedEnvelopesResponse {
    private String link;
    private String Tpwd;
    private String longTpwd;
    private String shortURL;
    private String mobile_url;
    private String schema_url;
    private String short_url;
    private String we_app_web_view_short_url;
    private String mobile_short_url;
    private String we_app_web_view_url;
    private String url;
}
