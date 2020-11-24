package com.dtk.api.response.mastertool;

import lombok.Getter;
import lombok.Setter;

/**
 * 淘口令生成响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:25
 */
@Getter
@Setter
public class DtkCreatTaokoulingResponse {
    private String model;
    private String longTpwd;
}
