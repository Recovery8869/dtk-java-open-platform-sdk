package com.dtk.api.response.search;

import com.dtk.api.response.putstorage.DtkBaseItemResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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
    @ApiModelProperty(value = "商品信息-商品小图列表(2021/15新增字段)")
    private String smallImages;
    @ApiModelProperty(value = "特色文案（2021/6/25新增字段）")
    private List<String> specialText;
    private List<BrandInfo> brandList;

    @Data
    public static class BrandInfo {
        private Integer brandId;
        private Integer brandLogo;
        private Integer brandName;
    }

}