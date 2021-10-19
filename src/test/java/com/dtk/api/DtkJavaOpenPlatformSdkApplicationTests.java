package com.dtk.api;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.controller.AppKeyConstant;
import com.dtk.api.request.search.DtkJdGoodsTypeRequest;
import com.dtk.api.request.search.DtkPddGoodsTypeRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import com.dtk.api.response.search.DtkJdGoodsTypeResponse;
import com.dtk.api.response.search.DtkPddGoodsTypeResponse;
import com.dtk.api.response.special.*;
import com.dtk.api.utils.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DtkJavaOpenPlatformSdkApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>> dtkResponse = new DtkApiResponse<>();

        DtkPageResponse<DtkOpGoodsListResponse> objectDtkPageResponse = new DtkPageResponse<>();
        ArrayList<DtkOpGoodsListResponse> objects = new ArrayList<>();
        DtkOpGoodsListResponse dtkOpGoodsListResponse1 = new DtkOpGoodsListResponse();
        dtkOpGoodsListResponse1.setEstimateAmount(BigDecimal.TEN);
        dtkOpGoodsListResponse1.setNineCid(2432544);
        dtkOpGoodsListResponse1.setVideo("sfafdsadf");

        DtkOpGoodsListResponse dtkOpGoodsListResponse2 = new DtkOpGoodsListResponse();
        dtkOpGoodsListResponse2.setNineCid(12334234);
        dtkOpGoodsListResponse2.setFreeshipRemoteDistrict(123);
        dtkOpGoodsListResponse2.setActivityEndTime("2020-10-09");

        DtkOpGoodsListResponse dtkOpGoodsListResponse3 = new DtkOpGoodsListResponse();
        dtkOpGoodsListResponse3.setTeamName("ffffff");
        dtkOpGoodsListResponse3.setTwoHoursSales(BigDecimal.ONE);
        dtkOpGoodsListResponse3.setSellerId("13242443");
        dtkOpGoodsListResponse3.setNineCid(53453);

        DtkOpGoodsListResponse dtkOpGoodsListResponse4 = new DtkOpGoodsListResponse();
        dtkOpGoodsListResponse4.setSellerId("23424");
        dtkOpGoodsListResponse4.setActivityEndTime("2020-10-11");
        dtkOpGoodsListResponse4.setYunfeixian(234234);
        dtkOpGoodsListResponse4.setEstimateAmount(BigDecimal.TEN);

        objects.add(dtkOpGoodsListResponse1);
        objects.add(dtkOpGoodsListResponse2);
        objects.add(dtkOpGoodsListResponse3);
        objects.add(dtkOpGoodsListResponse4);
        objectDtkPageResponse.setList(objects);
        objectDtkPageResponse.setPageId("1");
        objectDtkPageResponse.setTotalNum(1000L);

        dtkResponse.setData(objectDtkPageResponse);
        dtkResponse.setCode(0);
        dtkResponse.setMsg("test");

        DtkGetHalfPriceDayResponse dtkGetHalfPriceDayResponse = new DtkGetHalfPriceDayResponse();
        DtkGetHalfPriceDayPriceResponse dtkGetHalfPriceDayPriceResponse = new DtkGetHalfPriceDayPriceResponse();
        dtkGetHalfPriceDayPriceResponse.setBanner("2344");
        dtkGetHalfPriceDayPriceResponse.setList(new ArrayList<DtkGetHalfPriceDayPriceItemResponse>() {{
            DtkGetHalfPriceDayPriceItemResponse dtkGetHalfPriceDayPriceItemResponse = new DtkGetHalfPriceDayPriceItemResponse();
            dtkGetHalfPriceDayPriceItemResponse.setActivityId(10L);
            dtkGetHalfPriceDayPriceItemResponse.setId(23243);
            dtkGetHalfPriceDayPriceItemResponse.setPicUrl("234234");
            add(dtkGetHalfPriceDayPriceItemResponse);
        }});

        dtkGetHalfPriceDayResponse.setHalfPriceInfo(dtkGetHalfPriceDayPriceResponse);
        dtkGetHalfPriceDayResponse.setSessionsList(new ArrayList<DtkGetHalfPriceDaySessionResponse>() {{
            DtkGetHalfPriceDaySessionResponse dtkGetHalfPriceDaySessionResponse = new DtkGetHalfPriceDaySessionResponse();
            dtkGetHalfPriceDaySessionResponse.setHpdTime("2020");
            dtkGetHalfPriceDaySessionResponse.setStatus("1");
            add(dtkGetHalfPriceDaySessionResponse);
        }});
        String y = JsonUtil.objectToJson(dtkGetHalfPriceDayResponse);
        DtkGetHalfPriceDayResponse dtkGetHalfPriceDayResponse1 = JsonUtil.jsonToPojoByClass(y, DtkGetHalfPriceDayResponse.class);


        String x = JsonUtil.objectToJson(dtkResponse);
        System.out.println(x);


        TypeReference<DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>>> typeReference = new TypeReference<DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>>>() {
        };

        // JsonUtil.jsonToList()
        DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>> dtkPageResponseDtkResponse = JsonUtil.jsonToPojoByTypeReference(x, typeReference);


        // final ParameterizedTypeImpl type = ParameterizedTypeImpl.make(Pager.class, types, Pager.class.getDeclaringClass());

        JavaType javaTypePage = new ObjectMapper().getTypeFactory().constructParametricType(DtkPageResponse.class,
                DtkOpGoodsListResponse.class);

        JavaType javaTypeList = new ObjectMapper().getTypeFactory().constructParametricType(List.class,
                DtkGetDtkSearchGoodsResponse.class);

        // 方式3
        JavaType javaType = new ObjectMapper().getTypeFactory().constructParametricType(DtkApiResponse.class,
                javaTypePage);
        Object o = JsonUtil.jsonToPojoByJavaType(x, javaType);
        System.out.println("test end");
    }

    @Test
    // 京东商品类目
    void DtkJdGoodsTypeRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdGoodsTypeRequest request = new DtkJdGoodsTypeRequest();
        request.setVersion("v1.0.0");
        request.setParentId("654");
        request.setLevel("2");
        DtkApiResponse<List<DtkJdGoodsTypeResponse>> execute = client.execute(request);
    }

    @Test
    // 拼多多商品类目
    void DtkPddGoodsTypeRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPddGoodsTypeRequest request = new DtkPddGoodsTypeRequest();
        request.setVersion("v1.0.0");
        request.setParentId("6630");
        DtkApiResponse<List<DtkPddGoodsTypeResponse>> execute = client.execute(request);
    }

    @Test
    // 商品列表
    void DtkGoodsListRequest() {
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
        request.setBrandIds("362150325");
        request.setPriceLowerLimit(BigDecimal.ONE);
        request.setPriceUpperLimit(BigDecimal.TEN);
        request.setCouponPriceLowerLimit(BigDecimal.ONE);
        request.setCommissionRateLowerLimit(BigDecimal.ONE);
        request.setMonthSalesLowerLimit(BigDecimal.ONE);
        request.setFreeshipRemoteDistrict(1);
        request.setDirectCommissionType(0);
        request.setChoice(1);
        request.setFlagShipStore(1);
        request.setIsNew(1);
        request.setLowestPrice(BigDecimal.ONE);
        DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> execute = client.execute(request);
    }

    @Test
    // 单品详情
    void DtkGoodsDetailsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGoodsDetailsRequest request = new DtkGoodsDetailsRequest();
        request.setId(36005006);
        request.setGoodsId("642739867031");
        DtkApiResponse<DtkGoodsDetailsResponse> execute = client.execute(request);
    }

    @Test
    // 大淘客搜索
    void DtkGetDtkSearchGoodsRequest() {
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

    // 超级搜索
    @Test
    void DtkListSuperGoodsRequest() {
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

    // 拼多多联盟搜索
    @Test
    void DtkPddUnionQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPddUnionQueryRequest request = new DtkPddUnionQueryRequest();
        request.setActivityTags("4");
        request.setBlockCats("1");
        request.setBlockCatPackages("1");
        request.setCatId(1);
        request.setGoodsSignList("");
        request.setIsBrandGoods(0);
        request.setKeyword("男装");
        request.setListId("0");
        request.setMerchantTypeList("3");
        request.setOptId(1);
        request.setPage(100);
        request.setRangeList("[{range_id:0,range_from:1,range_to:1500}, {range_id:1,range_from:1,range_to:1500}]");
        request.setSortType(0);
        request.setWithCoupon(1);
        request.setWithCategoryInfo(0);
        DtkApiResponse<DtkPddUnionQueryResponse> execute = client.execute(request);
    }

    // 活动商品
    @Test
    void DtkActivityGoodsListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkActivityGoodsListRequest request = new DtkActivityGoodsListRequest();
        request.setPageId("1");
        request.setActivityId(98);
        request.setPageSize(100);
        request.setCid(1);
        request.setSubcid(1);
        request.setFreeshipRemoteDistrict(1);
        DtkApiResponse<DtkPageResponse<DtkActivityGoodsListResponse>> execute = client.execute(request);
    }
}
