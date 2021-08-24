package com.dtk.api.response.putstorage;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author:YSH
 * @date: 2021/8/24
 * @time: 14:20
 */
@Getter
@Setter
public class DtkPddGoodsDetailsResponse {
    private Integer categoryId;
    private String categoryName;
    private List<String> goodsGalleryUrls;
    private Integer goodsId;
    private List<String> catIds;
    private BigDecimal couponDiscount;
    private String couponEndTime;
    private BigDecimal couponMinOrderAmount;
    private Integer couponRemainQuantity;
    private String couponStartTime;
    private Integer couponTotalQuantity;
    private String descTxt;
    private String goodsDesc;
    private String goodsImageUrl;
    private String goodsName;
    private String goodsSign;
    private String goodsThumbnailUrl;
    private Integer hasCoupon;
    private Integer hasMallCoupon;
    private String lgstTxt;
    private Integer mallCouponDiscountPct;
    private String mallCouponEndTime;
    private BigDecimal mallCouponMaxDiscountAmount;
    private BigDecimal mallCouponMinOrderAmount;
    private Integer mallCouponRemainQuantity;
    private String mallCouponStartTime;
    private Integer mallCouponTotalQuantity;
    private Integer mallCps;
    private Integer mallId;
    private String mallName;
    private Integer merchantType;
    private BigDecimal minGroupPrice;
    private BigDecimal minNormalPrice;
    private Integer onlySceneAuth;
    private Integer optId;
    private List<Integer> optIds;
    private String optName;
    private Integer planType;
    private Integer predictPromotionRate;
    private Integer promotionRate;
    private String salesTip;
    private List<Integer> serviceTags;
    private String servTxt;
    private Integer shareRate;
    private List<String> unifiedTags;
    private List<String> videoUrls;
    private Integer zsDuoId;
}
