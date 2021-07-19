package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.special.*;
import com.dtk.api.response.DtkSingleAlbumCommodityResponse;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.putstorage.DtkBaseItemResponse;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import com.dtk.api.response.special.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * test
 *
 * @author qiuchao
 * @date 2021/7/14 13.43
 */
@SpringBootTest
class SpecialControllerTest {

    @Test
        //热门活动请求参数实体
    void dtkActivityCatalogueRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkActivityCatalogueRequest request = new DtkActivityCatalogueRequest();
        DtkApiResponse<List<DtkActivityCatalogueResponse>> execute = client.execute(request);
    }

    @Test
        //活动商品请求参数实体
    void dtkActivityGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkActivityGoodsListRequest request = new DtkActivityGoodsListRequest();
        request.setPageId("1");
        request.setActivityId(20);
        request.setPageSize(100);
        request.setCid(1);
        request.setSubcid(1);
        request.setFreeshipRemoteDistrict(1);
        DtkApiResponse<DtkPageResponse<DtkActivityGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //专辑列表请求参数实体
    void dtkAlbumListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkAlbumListRequest request = new DtkAlbumListRequest();
        request.setAlbumType(0);
        request.setPageId("1");
        request.setPageSize(20);
        request.setSort(0);
        DtkApiResponse<DtkPageResponse<DtkAlbumListResponse>> execute = client.execute(request);
    }

    @Test
        //京东大牌折扣请求参数实体
    void dtkBigBrandDiscountRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkBigBrandDiscountRequest request = new DtkBigBrandDiscountRequest();
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkBigBrandDiscountResponse> execute = client.execute(request);
    }

    @Test
        //轮播图请求参数实体
    void dtkCarouselMapResponseRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCarouselMapResponseRequest request = new DtkCarouselMapResponseRequest();
        DtkApiResponse<List<DtkCarouselMapResponseResponse>> execute = client.execute(request);
    }

    @Test
        //精选专题请求参数实体
    void dtkCatalogueRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCatalogueRequest request = new DtkCatalogueRequest();
        DtkApiResponse<List<DtkCatalogueResponse>> execute = client.execute(request);
    }

    @Test
        //咚咚抢请求参数实体
    void dtkDdqGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkDdqGoodsListRequest request = new DtkDdqGoodsListRequest();
        request.setRoundTime("2021-07-14 12:00:00");  //√
        DtkApiResponse<DtkDdqGoodsListResponse> execute = client.execute(request);
    }

    @Test
        //大淘客独家券商品请求参数实体
    void dtkExclusiveGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkExclusiveGoodsListRequest request = new DtkExclusiveGoodsListRequest();
        request.setPageSize(50);
        request.setPageId("1");
        request.setCids("1");
        request.setSort("0");
        DtkApiResponse<DtkPageResponse<DtkExclusiveGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //每日爆品推荐请求参数实体
    void dtkExplosiveGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkExplosiveGoodsListRequest request = new DtkExplosiveGoodsListRequest();
        request.setPageId("1");
        request.setPageSize(50);
        request.setPriceCid("1");
        request.setCids("2");
        DtkApiResponse<DtkPageResponse<DtkPopularGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //朋友圈文案请求参数实体
    void dtkFriendsCircleListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkFriendsCircleListRequest request = new DtkFriendsCircleListRequest();
        request.setPageId("1");
        request.setPageSize(100);
        request.setSort("0");
        request.setCid("6");
        request.setSubcid("116908");
        request.setPre(1);
        request.setFreeshipRemoteDistrict(1);
        request.setGoodsId("586504728742");
        DtkApiResponse<DtkPageResponse<DtkFriendsCircleListResponse>> execute = client.execute(request);
    }

    @Test
        //单个品牌详情请求参数实体
    void dtkGetBrandGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetBrandGoodsListRequest request = new DtkGetBrandGoodsListRequest();
        request.setBrandId("3547926");
        request.setPageId("1");
        request.setPageSize(50);
        DtkApiResponse<DtkDiffPageResponse<DtkGetBrandGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //品牌库请求参数实体
    void dtkGetBrandListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetBrandListRequest request = new DtkGetBrandListRequest();
        request.setPageId("1");
        request.setPageSize(50);
        DtkApiResponse<List<DtkGetBrandListResponse>> execute = client.execute(request);
    }

    @Test
        //品牌栏目请求参数实体
    void dtkGetColumnListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetColumnListRequest request = new DtkGetColumnListRequest();
        request.setCid(12);
        request.setPageId("1");
        request.setPageSize(50);
        DtkApiResponse<DtkDiffPageResponse<DtkGetColumnListResponse>> execute = client.execute(request);
    }

    @Test
        //每日半价请求参数实体
    void dtkGetHalfPriceDayRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetHalfPriceDayRequest request = new DtkGetHalfPriceDayRequest();
        request.setSessions("08");
        DtkApiResponse<DtkGetHalfPriceDayResponse> execute = client.execute(request);
    }

    @Test
        //各大榜单(包含所有榜单类型)请求参数实体
    void dtkGetRankingListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetRankingListRequest request = new DtkGetRankingListRequest();
        request.setRankType(1);
        request.setCid(12);
        request.setPageSize(20);
        request.setPageId("1");
        DtkApiResponse<List<DtkGetRankingListMergeResponse>> execute = client.execute(request);
    }

    @Test
        //细分类目榜请求实体参数
    void dtkGetRankListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetRankListRequest request = new DtkGetRankListRequest();
        request.setSubdivisionId("16");
        DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>> execute = client.execute(request);
    }

    @Test
        //官方活动(1元购)请求参数实体
    void dtkGetTbTopicListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetTbTopicListRequest request = new DtkGetTbTopicListRequest();
        request.setPageId("1");
        request.setPageSize(20);
        request.setType(0);
        request.setChannelId("0");
        DtkApiResponse<List<DtkGetTbTopicListResponse>> execute = client.execute(request);
    }

    @Test
        //高佣精选请求实体参数
    void dtkHighCommissionSelectedRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkHighCommissionSelectedRequest request = new DtkHighCommissionSelectedRequest();
        request.setPageSize(20);
        request.setPageId("1");
        request.setCid(12);
        request.setSort(1);
        DtkApiResponse<DtkPageResponse<DtkHighCommissionSelectedResponse>> execute = client.execute(request);
    }

    @Test
        //历史新低商品合集请求实体参数
    void dtkHistoricalNewLowCommodityRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkHistoricalNewLowCommodityRequest request = new DtkHistoricalNewLowCommodityRequest();
        request.setPageSize(20);
        request.setPageId("1");
        request.setSort("0");
        request.setCids("12");
        DtkApiResponse<DtkPageResponse<DtkHistoricalNewLowCommodityResponse>> execute = client.execute(request);
    }

    @Test
        //京东商品历史券后价请求参数实体
    void dtkJdCommodityDiscountPriceRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdCommodityDiscountPriceRequest request = new DtkJdCommodityDiscountPriceRequest();
        request.setSkuId(34646931);
        request.setOffsetDays("1");
        DtkApiResponse<DtkJdCommodityDiscountPriceResponse> execute = client.execute(request);
    }

    @Test
        //京东年货节商品请求实体参数
    void dtkJdNewYearCommodityRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdNewYearCommodityRequest request = new DtkJdNewYearCommodityRequest();
        request.setPageSize(20);
        request.setPageId("1");
        request.setSort("0");
        request.setCids("1,2,3");
        request.setSubsidy("3");
        DtkApiResponse<DtkPageResponse<DtkJdNewYearCommodityResponse>> execute = client.execute(request);
    }

    @Test
        //京东一元购订单查询请求参数实体
    void dtkJdOneDollarPurchaseOrderInquiryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdOneDollarPurchaseOrderInquiryRequest request = new DtkJdOneDollarPurchaseOrderInquiryRequest();
        request.setOrderTimeType("1");
        request.setStartTime("2021-07-14 13:00:00");
        request.setEndTime("2021-07-14 14:00:00");

        request.setPageId("1");
        request.setPageSize(20);
        request.setCode("xxxx");
        DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseOrderInquiryResponse>> execute = client.execute(request);
    }

    @Test
        //猜你喜欢请求参数实体
    void dtkListSimilerGoodsByOpenRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkListSimilerGoodsByOpenRequest request = new DtkListSimilerGoodsByOpenRequest();
        request.setId(34634133);
        request.setSize(10);
        DtkApiResponse<DtkPageResponse<DtkListSimilerGoodsByOpenResponse>> execute = client.execute(request);
    }

    @Test
        //直播好货请求参数实体
    void dtkLiveMaterialGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkLiveMaterialGoodsListRequest request = new DtkLiveMaterialGoodsListRequest();
        request.setDate("2021-07-14");
        request.setSort("0");
        DtkApiResponse<DtkPageResponse<DtkLiveMaterialGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //爆品预告商品合集请求参数实体
    void dtkMostPopularCommodityListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkMostPopularCommodityListRequest request = new DtkMostPopularCommodityListRequest();
        request.setType(1);
        DtkApiResponse<List<DtkMostPopularCommodityListResponse>> execute = client.execute(request);
    }

    @Test
        //京东9.9包邮请求参数实体
    void dtkNineFreeShippingRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkNineFreeShippingRequest request = new DtkNineFreeShippingRequest();
        request.setSort(0);
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkPageResponse<DtkNineFreeShippingResponse>> execute = client.execute(request);
    }

    @Test
        //9.9包邮精选请求参数实体
    void dtkOpGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkOpGoodsListRequest request = new DtkOpGoodsListRequest();
        request.setPageSize(20);
        request.setPageId("1");
        request.setNineCid("1");
        DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>> execute = client.execute(request);
    }

    @Test
        //热门主播力荐商品请求参数实体
    void dtkPopularAnchorCommendRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPopularAnchorCommendRequest request = new DtkPopularAnchorCommendRequest();
        request.setPageSize(20);
        request.setPageId("1");
        DtkApiResponse<DtkPageResponse<DtkPopularAnchorCommendResponse>> execute = client.execute(request);
    }

    @Test
        //淘宝商品历史券后价请求参数实体
    void dtkPriceTrendRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPriceTrendRequest request = new DtkPriceTrendRequest();
        request.setId("34634133");
        request.setGoodsId("589284195570");
        DtkApiResponse<DtkPriceTrendResponse> execute = client.execute(request);
    }

    @Test
        //问题：服务器错误
        //京东实时榜单请求参数实体
    void dtkRealTimeListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkRealTimeListRequest request = new DtkRealTimeListRequest();
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkPageResponse<DtkRealTimeListResponse>> execute = client.execute(request);
    }

    @Test
        //问题：服务器错误
        //单个专辑商品列表请求参数实体
    void dtkSingleAlbumCommodityRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkSingleAlbumCommodityRequest request = new DtkSingleAlbumCommodityRequest();
        request.setAlbumId(42707);
        DtkApiResponse<DtkSingleAlbumCommodityResponse> execute = client.execute(request);
    }

    @Test
        //细分类目合集请求参数实体
    void dtkSubdivisionCategoryListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkSubdivisionCategoryListRequest request = new DtkSubdivisionCategoryListRequest();
        request.setCid(1);
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkPageResponse<DtkSubdivisionCategoryListResponse>> execute = client.execute(request);
    }

    @Test
        //折上折请求参数实体
    void dtkSuperDiscountGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkSuperDiscountGoodsRequest request = new DtkSuperDiscountGoodsRequest();
        request.setPageSize(20);
        request.setPageId("1");
        request.setSort("0");

        request.setCids("1");
        DtkApiResponse<DtkPageResponse<DtkSuperDiscountGoodsResponse>> execute = client.execute(request);
    }

    @Test
        //线报请求参数实体
    void dtkTipOffRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkTipOffRequest request = new DtkTipOffRequest();
        request.setTopic(1);
        request.setPageId("1");
        request.setPageSize(20);
        request.setSelectTime(1617026400);
        DtkApiResponse<DtkTipOffResponse> execute = client.execute(request);
    }

    @Test
        //专题商品请求参数实体
    void dtkTopicGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkTopicGoodsListRequest request = new DtkTopicGoodsListRequest();
        request.setPageId("1");
        request.setTopicId(21);
        request.setPageSize(20);
        DtkApiResponse<DtkPageResponse<DtkBaseItemResponse>> execute = client.execute(request);
    }

}