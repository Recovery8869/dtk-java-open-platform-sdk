package com.dtk.api.response.putstorage;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 商品详情响应结果实体
 *
 * @author 1
 * @date 2020/11/10 15:54
 */
@Getter
@Setter
public class DtkGoodsDetailsResponse extends DtkGoodsListItemResponse {
    @ApiModelProperty(value = "淘宝轮播图")
    private String imgs;
    @ApiModelProperty(value = "相关商品图")
    private String reimgs;
    @ApiModelProperty(value = "该商品是否有细分类目：0不是，1是")
    private Integer isSubdivision;
    @ApiModelProperty(value = "该商品所属细分类目id")
    private Integer subdivisionId;
    @ApiModelProperty(value = "该商品所属细分类目名称")
    private String subdivisionName;
    @ApiModelProperty(value = "该商品所属细分类目排名")
    private Integer subdivisionRank;
}
