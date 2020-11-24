package com.dtk.api.response.special;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 热门活动响应结果实体
 *
 * @author baige
 * @date 2020/11/12 16:22
 */
@Data
public class DtkActivityCatalogueResponse {
    @ApiModelProperty(value = "活动ID")
    private Integer activityId;
    @ApiModelProperty(value = "活动名称")
    private String activityName;
    @ApiModelProperty(value = "活动开始时间")
    private Date startTime;
    @ApiModelProperty(value = "活动结束时间")
    private Date endTime;
    @ApiModelProperty(value = "单品标签图片")
    private String goodsLabel;
    @ApiModelProperty(value = "商详页标签图片")
    private String detailLabel;
    @ApiModelProperty(value = "活动商品类型 1.非定金商品 2.定金商品 3.付付定返红包")
    private Integer goodsType;
}
