package com.dtk.api.response.mastertool;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单查询接口响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:30
 */
@Getter
@Setter
public class DtkGetOrderDetailsResultsResponse {
    private List<DtkGetOrderDetailsResultsItemsResponse> publisher_order_dto;
}
