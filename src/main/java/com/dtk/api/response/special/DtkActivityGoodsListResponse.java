package com.dtk.api.response.special;

import com.dtk.api.response.putstorage.DtkBaseItemResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 活动商品响应结果实体
 *
 * @author baige
 * @date 2020/11/12 16:19
 */
@Getter
@Setter
public class DtkActivityGoodsListResponse extends DtkBaseItemResponse {
    @ApiModelProperty(value = "定金，若无定金，则显示0")
    private BigDecimal quanMLink;
    @ApiModelProperty(value = "立减，若无立减金额，则显示0")
    private BigDecimal hzQuanOver;
    @ApiModelProperty(value = "0.不包运费险 1.包运费险")
    private Integer yunfeixian;
    @ApiModelProperty(value = "预估淘礼金")
    private BigDecimal estimateAmount;
    @ApiModelProperty(value = "店铺logo")
    private String shopLogo;
    @ApiModelProperty(value = "偏远地区包邮，1-包邮，0-否")
    private Integer freeshipRemoteDistrict;
}
