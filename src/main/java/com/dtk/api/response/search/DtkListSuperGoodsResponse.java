package com.dtk.api.response.search;

import com.dtk.api.response.putstorage.DtkBaseItemResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 超级搜索响应结果实体
 *
 * @author 1
 * @date 2020/11/11 17:17
 */
@Getter
@Setter
public class DtkListSuperGoodsResponse extends DtkBaseItemResponse {
    @ApiModelProperty(value = "定金，若无定金，则显示0")
    private BigDecimal quanMLink;
    @ApiModelProperty(value = "立减，若无立减金额，则显示0")
    private BigDecimal hzQuanOver;
    @ApiModelProperty(value = "0.不包运费险 1.包运费险")
    private Integer yunfeixian;
    @ApiModelProperty(value = "预估淘礼金")
    private BigDecimal estimateAmount;
}
