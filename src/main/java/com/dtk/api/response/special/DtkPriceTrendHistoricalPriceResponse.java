package com.dtk.api.response.special;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品历史券后价响应结果价格趋势实体
 *
 * @author baige
 * @date 2020/11/12 10:24
 */
@Data
public class DtkPriceTrendHistoricalPriceResponse {
    private BigDecimal actualPrice;
    private Date date;
}
