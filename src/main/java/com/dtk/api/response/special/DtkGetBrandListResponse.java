package com.dtk.api.response.special;

import lombok.Data;

/**
 * 品牌库响应结果实体
 *
 * @author baige
 * @date 2020/11/12 16:08
 */
@Data
public class DtkGetBrandListResponse {
    private Long brandId;
    private String brandName;
    private String brandLogo;
    private Integer fansNum;
    private String brandDesc;
    private String brandEnglish;
    private String name;
    private String sellerId;
    private Integer brandScore;
    private String location;
    private String establishTime;
    private String belongTo;
    private String position;
    private String consumer;
    private String label;
    private String simpleLabel;
    private String cids;
    private Integer sales2h;
}
