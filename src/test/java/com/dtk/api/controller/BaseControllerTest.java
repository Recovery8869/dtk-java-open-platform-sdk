package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.putstorage.*;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.putstorage.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

/**
 * test
 *
 * @author qiuchao
 * @date 2021/7/12 11.15
 */
@SpringBootTest
class BaseControllerTest {

    @Test
        //单品详情请求参数实体
    void dtkGoodsDetailsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGoodsDetailsRequest request = new DtkGoodsDetailsRequest();
        request.setId(34617177);
        request.setGoodsId("1");
        DtkApiResponse<DtkGoodsDetailsResponse> execute = client.execute(request);
    }

    @Test
        //商品列表请求参数实体
    void dtkGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGoodsListRequest request = new DtkGoodsListRequest();
        request.setPageId("10");
        request.setPageSize(100);
        request.setCids("1,2,3");
        request.setSort("0");
        request.setSubcid(1);
        request.setSpecialId(1);
        request.setJuHuaSuan(1);
        request.setTaoQiangGou(0);
        request.setTmall(1);
        request.setTchaoshi(1);
        request.setGoldSeller(1);
        request.setHaitao(1);
        request.setPre(1);
        request.setPreSale(0);
        request.setBrand(0);
        request.setBrandIds("296748800");
        request.setPriceLowerLimit(BigDecimal.ONE);
        request.setPriceUpperLimit(BigDecimal.TEN);
        request.setCouponPriceLowerLimit(BigDecimal.ONE);
        request.setCommissionRateLowerLimit(BigDecimal.ONE);
        request.setMonthSalesLowerLimit(BigDecimal.ONE);
        request.setFreeshipRemoteDistrict(1);
        request.setDirectCommissionType(0);
        request.setChoice(1);
        DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> execute = client.execute(request);
    }

    @Test
        //京东商品详情请求参数实体
    void dtkJdCommodityDetailsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdCommodityDetailsRequest request = new DtkJdCommodityDetailsRequest();
        request.setSkuIds("1,2,3,4,5");
        DtkApiResponse<List<DtkJdCommodityDetailsResponse>> execute = client.execute(request);
    }

    @Test
        //商品更新请求参数实体
    void dtkNewestGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkNewestGoodsRequest request = new DtkNewestGoodsRequest();
        request.setPageId("1");
        request.setPageSize(10);
        request.setStartTime("2021-07-12 15:05:00");
        request.setEndTime("2021-07-13 15:05:05");
        request.setCids("1");
        request.setSubcid(1);
        request.setJuHuaSuan(1);
        request.setTmall(1);
        request.setTaoQiangGou(1);
        request.setGoldSeller(1);
        request.setHaitao(1);
        request.setBrand(1);
        request.setBrandIds("296748800");
        request.setPreSale(1);
        request.setPriceLowerLimit(BigDecimal.ONE);
        request.setPriceUpperLimit(BigDecimal.TEN);
        request.setCouponPriceLowerLimit(BigDecimal.ONE);
        request.setCommissionRateLowerLimit(BigDecimal.ONE);
        request.setMonthSalesLowerLimit(BigDecimal.ONE);
        request.setSort("0");
        DtkApiResponse<DtkPageResponse<DtkNewestGoodsResponse>> execute = client.execute(request);
    }

    @Test
        //定时拉取请求参数实体
    void dtkPullGoodsByTimeRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPullGoodsByTimeRequest request = new DtkPullGoodsByTimeRequest();
        request.setPageId("1");
        request.setPageSize(100);
        request.setCid("10");
        request.setSubcid(1);
        request.setPre(1);
        request.setSort("0");
        request.setStartTime("2021-7-14 15:09:00");
        request.setEndTime("2021-7-14 15:59:00");
        request.setFreeshipRemoteDistrict(1);
        request.setChoice(1);
        DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> execute = client.execute(request);
    }

    @Test
        //失效商品请求参数实体
    void dtkStaleGoodsByTimeRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkStaleGoodsByTimeRequest request = new DtkStaleGoodsByTimeRequest();
        request.setPageId("1");
        request.setPageSize(100);
        request.setStartTime("2021-07-15 15:00:00");
        request.setEndTime("2021-07-15 15:30:00");
        DtkApiResponse<DtkPageResponse<DtkStaleGoodsByTimeResponse>> execute = client.execute(request);
    }

}
