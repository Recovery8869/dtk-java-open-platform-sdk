package com.dtk.api.response.mastertool;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单查询接口响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:28
 */
@Getter
@Setter
public class DtkGetOrderDetailsResponse {
    private Boolean has_pre;
    private Boolean has_next;
    private Integer page_no;
    private Integer page_size;
    private String position_index;
    private DtkGetOrderDetailsResultsResponse results;
}
