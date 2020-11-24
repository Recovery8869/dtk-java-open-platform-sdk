package com.dtk.api.response.special;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 每日半价响应结果价格数据项实体
 *
 * @author baige
 * @date 2020/11/12 10:08
 */
@Data
public class DtkGetHalfPriceDayPriceItemResponse {
    private Integer top;
    private Integer hdLeixing;
    private Integer qiangNum;
    private Date updateTime;
    private Integer id;
    private Integer itemSoldNum;
    private String todaySellNum;
    private String itemId;
    private String name;
    private String picUrl;
    private BigDecimal price;
    private String yijuhua;
    private String preferential;
    private BigDecimal couponAmount;
    private Date startTime;
    private Long activityId;
    private Integer restCount;
    private Date serverTime;
    private Integer tmall;
    private Integer activityType;
    private Integer useQuan;
    private Integer isMamaQuan;
}
