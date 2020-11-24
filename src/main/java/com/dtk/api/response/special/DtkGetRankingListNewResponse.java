package com.dtk.api.response.special;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 各大榜单响应结果实体
 *
 * @author baige
 * @date 2020/11/12 17:09
 */
@Data
public class DtkGetRankingListNewResponse {
    /**
     * 公共数据结构
     */
    private Integer id;
    private String goodsId;
    private Integer ranking;
    private String dtitle;
    private BigDecimal actualPrice;
    private BigDecimal commissionRate;
    private BigDecimal couponPrice;
    private Integer couponReceiveNum;
    private Integer couponTotalNum;
    private BigDecimal monthSales;
    private BigDecimal twoHoursSales;
    private BigDecimal dailySales;
    private Integer hotPush;
    private String mainPic;
    private String title;
    private String desc;
    private BigDecimal originalPrice;
    private String couponLink;
    private String couponStartTime;
    private String couponEndTime;
    private Integer commissionType;
    private String createTime;
    private Integer activityType;
    private String imgs;
    private String guideName;
    private Integer shopType;
    private String couponConditions;
    private Integer newRankingGoods;
    private String sellerId;
    private BigDecimal quanMLink;
    private BigDecimal hzQuanOver;
    private Integer yunfeixian;
    private BigDecimal estimateAmount;
    private Integer freeshipRemoteDistrict;

    /**
     * 整合复购榜数据结构
     */
    private Integer avgSales;
    private String entryTime;

    /**
     * 整合热词飙升榜数据结构
     */
    private Integer top;
    private String keyWord;
    private Integer upVal;
    private List<DtkGetHotWordRankingResponse> goodsList;

    /**
     * 整合热词排行榜数据结构
     */
    private Integer hotVal;

    /**
     * 整合综合热搜榜数据结构
     */
    private Integer fresh;
    private Integer lowest;
    private Integer score;
    private Integer searchNum;
}
