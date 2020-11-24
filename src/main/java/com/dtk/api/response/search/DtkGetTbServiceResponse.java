package com.dtk.api.response.search;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 联盟搜索响应结果实体
 *
 * @author 1
 * @date 2020/11/11 17:33
 */
@Getter
@Setter
public class DtkGetTbServiceResponse {
    private String title;
    private Integer volume;
    private String nick;
    private String coupon_start_time;
    private String coupon_end_time;
    private String tk_total_sales;
    private String coupon_id;
    private String pict_url;
    private DtkGetTbServiceImagesResponse small_images;
    private String reserve_price;
    private String zk_final_price;
    private Integer user_type;
    private Long seller_id;
    private Integer coupon_total_count;
    private Integer coupon_remain_count;
    private String coupon_info;
    private String shop_title;
    private Integer shop_dsr;
    private String level_one_category_name;
    private Integer level_one_category_id;
    private String category_name;
    private Integer category_id;
    private String short_title;
    private String white_image;
    private String coupon_start_fee;
    private String coupon_amount;
    private String item_description;
    private Long item_id;
    private String commission_rate;
    private BigDecimal ysyl_tlj_face;
    private BigDecimal presale_deposit;
    private String presale_discount_fee_text;
}
