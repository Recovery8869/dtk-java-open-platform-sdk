package com.dtk.api.response.special;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author:YSH
 * @date: 2021/7/9
 * @time: 10:55
 */
@Getter
@Setter
public class DtkJdNewYearCommodityResponse {
    private List<ListInfo> list;

    @Data
    private static class ListInfo {
        private String couponAfterMoney;
        private String inOrderCount30Days;
        private String jumpUrl;
        private String img;
        private String skuId;
        private String skuName;
        private String subsidy;
        private String originMoney;
    }
}
