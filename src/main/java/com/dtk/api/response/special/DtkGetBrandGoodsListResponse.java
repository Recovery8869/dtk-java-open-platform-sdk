package com.dtk.api.response.special;

import com.dtk.api.response.base.DtkPageResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * 品牌商品列表响应结果实体
 *
 * @author 1
 * @date 2020/11/30 17:44
 */
@Getter
@Setter
public class DtkGetBrandGoodsListResponse extends DtkPageResponse<DtkGetColumnListResponse.BrandHotGoodsResponse> {
    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌logo
     */
    private String brandLogo;

    /**
     * 品牌描述
     */
    private String brandDesc;

    /**
     * 品牌特色（文案：一句话描述）
     */
    private String brandFeatures;

    /**
     * 品牌销量
     */
    private Integer sales;

    /**
     * 品牌粉丝数
     */
    private Integer fansNum;
}
