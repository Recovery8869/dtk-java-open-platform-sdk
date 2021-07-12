package com.dtk.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 9:15
 */
@SpringBootTest
@Slf4j
class GoodsControllerTest {
//
//    @Test
//    void getGoodsList() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGoodsListRequest request = new DtkGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/get-goods-list");
//        request.setVersion("v1.2.4");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setSort("0");
//        request.setCids("4,5");
//        request.setSubcid(123);
//        request.setSpecialId(1);
//        request.setJuHuaSuan(1);
//        request.setTaoQiangGou(1);
//        request.setTmall(1);
//        request.setTchaoshi(1);
//        request.setGoldSeller(1);
//        request.setHaitao(1);
//        request.setPre(1);
//        request.setPreSale(1);
//        request.setBrand(1);
//        request.setBrandIds("345,321,323");
//        request.setPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setPriceUpperLimit(BigDecimal.valueOf(5.1));
//        request.setCouponPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setCommissionRateLowerLimit(BigDecimal.valueOf(5.1));
//        request.setMonthSalesLowerLimit(BigDecimal.valueOf(5.1));
//        request.setFreeshipRemoteDistrict(1);
//        DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//
//    @Test
//    void getNewestGoodsList() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkNewestGoodsRequest request = new DtkNewestGoodsRequest();
//        //("https://openapi.dataoke.com/api/goods/get-newest-goods");
//        request.setVersion("v1.2.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setStartTime("202-11-30 00:00:00");
//        request.setEndTime("202-11-30 10:00:00");
//        request.setCids("4,5");
//        request.setSubcid(123);
//        request.setJuHuaSuan(1);
//        request.setTaoQiangGou(1);
//        request.setTmall(1);
//        request.setTchaoshi(1);
//        request.setGoldSeller(1);
//        request.setHaitao(1);
//        request.setBrand(1);
//        request.setBrandIds("345,321,323");
//        request.setPreSale(1);
//        request.setPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setPriceUpperLimit(BigDecimal.valueOf(5.1));
//        request.setCouponPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setCommissionRateLowerLimit(BigDecimal.valueOf(5.1));
//        request.setMonthSalesLowerLimit(BigDecimal.valueOf(5.1));
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkNewestGoodsResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getGoodsDetails() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGoodsDetailsRequest request = new DtkGoodsDetailsRequest();
//        //("https://openapi.dataoke.com/api/goods/get-goods-details");
//        request.setVersion("v1.2.3");
//        request.setId(30711757);
//        request.setGoodsId("123");
//        DtkApiResponse<DtkGoodsDetailsResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getStaleGoodsByTime() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkStaleGoodsByTimeRequest request = new DtkStaleGoodsByTimeRequest();
//        //("https://openapi.dataoke.com/api/goods/get-stale-goods-by-time");
//        request.setVersion("v1.0.1");
//        request.setPageId("1");
//        request.setPageSize(50);
//        request.setStartTime("2020-11-30 00:00:00");
//        request.setEndTime("2020-11-30 10:00:00");
//        DtkApiResponse<DtkPageResponse<DtkStaleGoodsByTimeResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getOwnerGoods() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetOwnerGoodsRequest request = new DtkGetOwnerGoodsRequest();
//        //("https://openapi.dataoke.com/api/goods/get-owner-goods");
//        request.setVersion("v1.0.1");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setOnline(1);
//        request.setStartTime("2020-10-09 00:00:00");
//        request.setEndTime("2020-10-10 00:00:00");
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkGetOwnerGoodsItemResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getCollectionList() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetCollectionListRequest request = new DtkGetCollectionListRequest();
//        //("https://openapi.dataoke.com/api/goods/get-collection-list");
//        request.setVersion("v1.0.1");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setCid("4,5");
//        request.setTrailerType(1);
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkGetCollectionListItemResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getDtkGoodsSearchGoods() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetDtkSearchGoodsRequest request = new DtkGetDtkSearchGoodsRequest();
//        //("https://openapi.dataoke.com/api/goods/get-dtk-search-goods");
//        request.setVersion("v2.1.2");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setKeyWords("口罩");
//        request.setCids("4,5");
//        request.setSubcid(123);
//        request.setJuHuaSuan(1);
//        request.setTaoQiangGou(1);
//        request.setTmall(1);
//        request.setTchaoshi(1);
//        request.setGoldSeller(1);
//        request.setHaitao(1);
//        request.setBrand(1);
//        request.setBrandIds("345,321,323");
//        request.setPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setPriceUpperLimit(BigDecimal.valueOf(5.1));
//        request.setCouponPriceLowerLimit(BigDecimal.valueOf(5.1));
//        request.setCommissionRateLowerLimit(BigDecimal.valueOf(5.1));
//        request.setMonthSalesLowerLimit(BigDecimal.valueOf(5.1));
//        request.setSort("0");
//        request.setFreeshipRemoteDistrict(0);
//        DtkApiResponse<DtkPageResponse<DtkGetDtkSearchGoodsResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void searchSuggestion() {
//        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkSearchSuggestionRequest request = new DtkSearchSuggestionRequest();
//        //("https://openapi.dataoke.com/api/goods/search-suggestion");
//        request.setVersion("v1.0.2");
//        request.setKeyWords("口罩");
//        request.setType(1);
//        DtkApiResponse<List<DtkSearchSuggestionResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getOpApiNineGoodsList() {
//        DtkClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkOpGoodsListRequest request = new DtkOpGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/nine/op-goods-list");
//        request.setVersion("v2.0.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setNineCid("-1");
//        DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getRankingList() {
//        // 整合版本
//        DtkClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkGetRankingListRequest request = new DtkGetRankingListRequest();
//        //("https://openapi.dataoke.com/api/goods/get-ranking-list");
//        request.setVersion("v1.3.0");
//        request.setCid(5);
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setRankType(1);
//        DtkApiResponse<List<DtkGetRankingListMergeResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//
//        // 区分版本
//        // 1,2,3
//        DtkGetRankingListByTimeWholeHotRequest request1 = new DtkGetRankingListByTimeWholeHotRequest();
//        request1.setVersion("v1.3.0");
//        request.setCid(5);
//        request1.setPageId("1");
//        request1.setPageSize(20);
//        request1.setRankType(1);
//        DtkApiResponse<List<DtkGetRankingListByTimeWholeHotResponse>> execute1 = client.execute(request1);
//        if (execute1.isSuccess()) {
//            // 业务逻辑
//        }
//        //4
//        DtkGetRankingListByReBuyRequest request2 = new DtkGetRankingListByReBuyRequest();
//        request2.setVersion("v1.3.0");
//        request2.setCid(5);
//        request2.setPageId("1");
//        request2.setPageSize(20);
//        request2.setRankType(4);
//        DtkApiResponse<List<DtkGetRankingListByReBuyResponse>> execute2 = client.execute(request2);
//        if (execute2.isSuccess()) {
//            // 业务逻辑
//        }
//        //5
//        DtkGetRankingListByHotWordUpRequest request3 = new DtkGetRankingListByHotWordUpRequest();
//        request3.setVersion("v1.3.0");
//        request3.setCid(5);
//        request3.setPageId("1");
//        request3.setPageSize(20);
//        request3.setRankType(5);
//        DtkApiResponse<List<DtkGetRankingListByHotWordUpResponse>> execute3 = client.execute(request3);
//        if (execute3.isSuccess()) {
//            // 业务逻辑
//        }
//        //6
//        DtkGetRankingListByHotWordRequest request4 = new DtkGetRankingListByHotWordRequest();
//        request4.setVersion("v1.3.0");
//        request4.setCid(5);
//        request4.setPageId("1");
//        request4.setPageSize(20);
//        request4.setRankType(6);
//        DtkApiResponse<List<DtkGetRankingListByHotWordResponse>> execute4 = client.execute(request4);
//        if (execute4.isSuccess()) {
//            // 业务逻辑
//        }
//        //7
//        DtkGetRankingListByHotSearchRequest request5 = new DtkGetRankingListByHotSearchRequest();
//        request5.setRequestUrl("https://openapi.dataoke.com/api/goods/get-ranking-list");
//        request5.setVersion("v1.3.0");
//        request5.setCid(5);
//        request5.setPageId("1");
//        request5.setPageSize(20);
//        request5.setRankType(7);
//        DtkApiResponse<List<DtkGetRankingListByHotSearchResponse>> execute5 = client.execute(request5);
//        if (execute5.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void listSimilerGoods() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkListSimilerGoodsByOpenRequest request = new DtkListSimilerGoodsByOpenRequest();
//        //("https://openapi.dataoke.com/api/goods/list-similer-goods-by-open");
//        request.setVersion("v1.2.2");
//        request.setId("1");
//        request.setSize(10);
//        DtkApiResponse<List<DtkListSimilerGoodsByOpenResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void topicCatalogue() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkCatalogueRequest request = new DtkCatalogueRequest();
//        //("https://openapi.dataoke.com/api/goods/topic/catalogue");
//        request.setVersion("v1.1.0");
//        DtkApiResponse<List<DtkCatalogueResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void topicList() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkTopicGoodsListRequest request = new DtkTopicGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/topic/goods-list");
//        request.setVersion("v1.1.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setTopicId(123);
//        DtkApiResponse<DtkPageResponse<DtkBaseItemResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void activityCatalogue() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkActivityCatalogueRequest request = new DtkActivityCatalogueRequest();
//        //("https://openapi.dataoke.com/api/goods/activity/catalogue");
//        request.setVersion("v1.1.0");
//        DtkApiResponse<List<DtkActivityCatalogueResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void activityGoodsList() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkActivityGoodsListRequest request = new DtkActivityGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/activity/goods-list");
//        request.setVersion("v1.2.2");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setActivityId(123);
//        request.setCid("xx");
//        request.setFreeshipRemoteDistrict(0);
//        request.setSubcid(123);
//        DtkApiResponse<DtkPageResponse<DtkActivityGoodsListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void friendsCircleList() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkFriendsCircleListRequest request = new DtkFriendsCircleListRequest();
//        //("https://openapi.dataoke.com/api/goods/friends-circle-list");
//        request.setVersion("v1.3.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setSort("0");
//        request.setCid("6");
//        request.setSubcid(123);
//        request.setPre(1);
//        request.setFreeshipRemoteDistrict(0);
//        request.setGoodsId("1234123");
//        DtkApiResponse<DtkPageResponse<DtkFriendsCircleListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void firstOrderGiftMoneyGoods() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkFirstOrderGiftMoneyRequest request = new DtkFirstOrderGiftMoneyRequest();
//        //("https://openapi.dataoke.com/api/goods/first-order-gift-money");
//        request.setVersion("v1.1.0");
//        request.setPageId("1");
//        request.setPageSize(10);
//        request.setSort("0");
//        request.setCids("4,5");
//        request.setKeyWord("口罩");
//        request.setGoodsType(1);
//        DtkApiResponse<DtkFirstOrderGiftMoneyResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void exclusiveGoodsList() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkExclusiveGoodsListRequest request = new DtkExclusiveGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/exclusive-goods-list");
//        request.setVersion("v1.0.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setCids("1,2,3");
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkExclusiveGoodsListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void explosiveGoods() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkExplosiveGoodsListRequest request = new DtkExplosiveGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/explosive-goods-list");
//        request.setVersion("v1.0.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setPriceCid("1");
//        request.setCids("1,2,3");
//        DtkApiResponse<DtkPageResponse<DtkExplosiveGoodsListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void liveMaterialGoods() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkLiveMaterialGoodsListRequest request = new DtkLiveMaterialGoodsListRequest();
//        //("https://openapi.dataoke.com/api/goods/liveMaterial-goods-list");
//        request.setVersion("v1.0.0");
//        request.setDate("2020-09-16");
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkLiveMaterialGoodsListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void priceTrend() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkPriceTrendRequest request = new DtkPriceTrendRequest();
//        //("https://openapi.dataoke.com/api/goods/price-trend");
//        request.setVersion("v1.0.0");
//        request.setId("xx");
//        request.setGoodsId("xx");
//        DtkApiResponse<DtkPriceTrendResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getSuperDiscount() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkSuperDiscountGoodsRequest request = new DtkSuperDiscountGoodsRequest();
//        //("https://openapi.dataoke.com/api/goods/super-discount-goods");
//        request.setVersion("v1.0.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setCids("4,5,6");
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkSuperDiscountGoodsResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getHalfPriceDay() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkGetHalfPriceDayRequest request = new DtkGetHalfPriceDayRequest();
//        //("https://openapi.dataoke.com/api/goods/get-half-price-day");
//        request.setVersion("v1.0.0");
//        request.setSessions("16");
//        DtkApiResponse<DtkGetHalfPriceDayResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void jdOneDollarPurchase() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkJdOneDollarPurchaseRequest request = new DtkJdOneDollarPurchaseRequest();
//        //("https://openapi.dataoke.com/api/goods/jd-one-dollar-purchase");
//        request.setVersion("v1.0.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setCids("5");
//        request.setSort("0");
//        DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void listSuperGoods() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkListSuperGoodsRequest request = new DtkListSuperGoodsRequest();
//        //("https://openapi.dataoke.com/api/goods/list-super-goods");
//        request.setVersion("v1.3.0");
//        request.setPageId("1");
//        request.setPageSize(20);
//        request.setType(0);
//        request.setKeyWords("口罩");
//        request.setTmall(0);
//        request.setHaitao(0);
//        request.setSort("total_sales_asc");
//        request.setSpecialId("xxx");
//        request.setChannelId("xxx");
//        DtkApiResponse<DtkPageResponse<DtkListSuperGoodsResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
}