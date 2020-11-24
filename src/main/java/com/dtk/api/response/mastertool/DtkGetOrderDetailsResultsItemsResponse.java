package com.dtk.api.response.mastertool;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单查询接口响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:31
 */
@Getter
@Setter
public class DtkGetOrderDetailsResultsItemsResponse {
    private String terminal_type;
    private String item_category_name;
    private String tk_paid_time;
    private Long adzone_id;
    private String alipay_total_price;
    private String seller_shop_title;
    private String alimama_share_fee;
    private String trade_id;
    private String click_time;
    private String subsidy_rate;
    private Integer refund_tag;
    private String item_title;
    private String order_type;
    private String tb_paid_time;
    private Integer tk_order_role;
    private String total_commission_fee;
    private Long pub_id;
    private String item_img;
    private String alimama_rate;
    private Long item_id;
    private String item_price;
    private String tb_deposit_time;
    private Integer tk_status;
    private String total_commission_rate;
    private String trade_parent_id;
    private String subsidy_type;
    private String tk_create_time;
    private String pub_share_fee;
    private Integer item_num;
    private String tk_commission_fee_for_media_platform;
    private String income_rate;
    private String site_name;
    private String pub_share_pre_fee;
    private String tk_commission_rate_for_media_platform;
    private String tk_deposit_time;
    private String tk_total_rate;
    private String pub_share_rate;
    private String adzone_name;
    private Long site_id;
    private String item_link;
    private String deposit_price;
    private String seller_nick;
    private String subsidy_fee;
    private String flow_source;
    private String tk_commission_pre_fee_for_media_platform;
}
