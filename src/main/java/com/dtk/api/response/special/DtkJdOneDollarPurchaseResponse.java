package com.dtk.api.response.special;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 京东一元购响应结果实体
 *
 * @author 1
 * @date 2020/11/11 17:51
 */
@Getter
@Setter
public class DtkJdOneDollarPurchaseResponse {
    private BigDecimal couponAfterMoney;
    private String skuId;
    private String skuName;
    private String img;
    private String jumpUrl;
    private Integer inOrderCount30Days;
    private BigDecimal originMoney;
    private BigDecimal subsidy;
}
