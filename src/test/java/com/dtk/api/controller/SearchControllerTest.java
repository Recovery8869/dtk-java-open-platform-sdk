package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.search.*;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.search.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;


/**
 * test
 *
 * @author qiuchao
 * @date 2021/7/15 10.03
 */
@SpringBootTest
class SearchControllerTest {

    @Test
        //大淘客搜索请求参数实体
    void dtkGetDtkSearchGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetDtkSearchGoodsRequest request = new DtkGetDtkSearchGoodsRequest();
        request.setPageId("1");
        request.setKeyWords("男装");
        request.setCids("1");
        request.setSubcid(1);
        request.setJuHuaSuan(0);
        request.setTaoQiangGou(0);
        request.setTmall(0);
        request.setTchaoshi(0);
        request.setGoldSeller(0);
        request.setHaitao(0);
        request.setBrand(0);
        request.setBrandIds("218756504");
        request.setPriceLowerLimit(BigDecimal.ONE);
        request.setPriceUpperLimit(BigDecimal.TEN);
        request.setCouponPriceLowerLimit(BigDecimal.ONE);
        request.setCommissionRateLowerLimit(BigDecimal.ONE);
        request.setMonthSalesLowerLimit(BigDecimal.TEN);
        request.setSort("0");
        request.setFreeshipRemoteDistrict(1);
        DtkApiResponse<DtkPageResponse<DtkGetDtkSearchGoodsResponse1>> execute = client.execute(request);
    }

    @Test
        //联盟搜索请求参数实体
    void dtkGetTbServiceRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetTbServiceRequest request = new DtkGetTbServiceRequest();
        request.setPageNo(Long.valueOf(10));
        request.setPageSize(Long.valueOf(20));
        request.setKeyWords("男装");
        request.setSort("total_sales_asc");
        request.setSource(1);
        request.setOverseas(1);
        request.setEndPrice(Long.valueOf(100));
        request.setStartPrice(Long.valueOf(10));
        request.setEndTkRate(Long.valueOf(100));
        request.setStartTkRate(Long.valueOf(1));
        request.setHasCoupon(false);
        request.setSpecialId("");  //无会员运营id
        request.setChannelId("");  //无渠道id
        request.setItemLoc("成都");
        request.setNeedPrepay("1");
        request.setIncludeGoodRate("1");
        DtkApiResponse<List<DtkGetTbServiceResponse>> execute = client.execute(request);
    }

    @Test
        //热搜记录请求参数实体
    void dtkGetTop100Request() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetTop100Request request = new DtkGetTop100Request();
        request.setType(1);
        DtkApiResponse<DtkGetTop100Response> execute = client.execute(request);
    }

    @Test
        //热搜榜请求参数实体
    void dtkHotSearchListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkHotSearchListRequest request = new DtkHotSearchListRequest();
        DtkApiResponse<List<DtkHotSearchListResponse>> execute = client.execute(request);
    }

    @Test
        //京东联盟搜索请求参数实体
    void dtkJdUnionQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdUnionQueryRequest request = new DtkJdUnionQueryRequest();
        request.setCid1(Long.valueOf(1));
        request.setCid2(Long.valueOf(2));
        request.setCid3(Long.valueOf(3));
        request.setPageId("1");
        request.setPageSize(20);
        request.setSkuIds("1");
        request.setKeyword("男装");
        request.setPriceFrom(BigDecimal.ONE);
        request.setPriceTo(BigDecimal.TEN);
        request.setCommissionShareEnd("1");
        request.setCommissionShareEnd("1");
        request.setOwner("g");
        request.setSortName("price");
        request.setSort("asc");
        request.setIsCoupon(1);
        request.setPingouPriceEnd(BigDecimal.ONE);
        request.setPingouPriceEnd(BigDecimal.TEN);
        request.setBrandCode("李宁");
        request.setShopId(1);
        request.setHasBestCoupon(1);
        request.setPid("");
        request.setJxFlags("1");
        request.setSpuId(Long.valueOf(10));
        request.setDeliveryType(1);
        DtkApiResponse<DtkJdUnionQueryResponse> execute = client.execute(request);
    }

    @Test
        //超级搜索请求参数实体
    void dtkListSuperGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkListSuperGoodsRequest request = new DtkListSuperGoodsRequest();
        request.setType(1);
        request.setPageId("1");
        request.setPageSize(20);
        request.setKeyWords("男装");
        request.setTmall(1);
        request.setHaitao(1);
        request.setSort("price");
        request.setSpecialId("0");
        request.setChannelId("0");
        request.setPriceLowerLimit("10");
        request.setPriceUpperLimit("100");
        request.setEndTkRate("100");
        request.setStartTkRate("10");
        request.setHasCoupon("1");
        DtkApiResponse<DtkPageResponse<DtkListSuperGoodsResponse>> execute = client.execute(request);
    }

    @Test
        //拼多多联盟搜索请求参数实体
    void dtkPddUnionQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPddUnionQueryRequest request = new DtkPddUnionQueryRequest();
        request.setActivityTags("4");
        request.setBlockCats("1");
        request.setBlockCatPackages("1");
        request.setCatId(18637);
        request.setGoodsSignList("c9P2jRpRmgtJ1VwhwfDYszxC2he2_J5tZDZmc3");
        request.setIsBrandGoods(1);
        request.setKeyword("男装");
        request.setListId("1");
        request.setMerchantTypeList("1");
        request.setOptId(16);
        request.setPage(1);
        request.setPageSize(100);
        request.setRangeList("0");
        request.setSortType(0);
        request.setWithCoupon(0);
        DtkApiResponse<DtkPddUnionQueryResponse> execute = client.execute(request);
    }

    @Test
        //联想词请求参数实体
    void dtkSearchSuggestionRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkSearchSuggestionRequest request = new DtkSearchSuggestionRequest();
        request.setKeyWords("男装");
        request.setType(1);
        DtkApiResponse<List<DtkSearchSuggestionResponse>> execute = client.execute(request);
    }

}
