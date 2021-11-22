package com.dtk.api;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.controller.AppKeyConstant;
import com.dtk.api.request.mastertool.DtkJdOrderQueryRequest;
import com.dtk.api.request.search.DtkGetDtkSearchGoodsRequest;
import com.dtk.api.request.search.DtkJdGoodsTypeRequest;
import com.dtk.api.request.search.DtkPddGoodsTypeRequest;
import com.dtk.api.request.special.DtkGetRankListRequest;
import com.dtk.api.request.special.DtkGetRankingListRequest;
import com.dtk.api.request.special.DtkRealTimeListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.base.DtkSearchPageResponse;
import com.dtk.api.response.mastertool.DtkJdOrderQueryResponse;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse1;
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
    void DtkJdOrderSearchRequest() {
        DtkApiClient client =
                DtkApiClient.getInstance("6124f5234d2f1", "f8a0c3d992001c84dd9770380269662c");
        DtkJdOrderQueryRequest request = new DtkJdOrderQueryRequest();
        request.setType("1");
// request.setKey(dataokeConfigProperties.getJdKey());
        request.setKey(
                "3a1d4d464bde27232688545ad568e4f62daf62be413025c8f2a9689279210cf6ee6a8180450d3c64");
        request.setStartTime("2021-10-08 11:40:00");
        request.setEndTime("2021-10-08 12:00:00");
        request.setPageNo(1);
        request.setPageSize(10);

        DtkApiResponse<List<DtkJdOrderQueryResponse>> response = client.execute(request);
        System.out.println(JsonUtil.objectToJson(response));
    }

    @Test
    void DtkJdRankRealTimeRequest() {
        DtkApiClient client =
                DtkApiClient.getInstance("6124f5234d2f1", "f8a0c3d992001c84dd9770380269662c");
        DtkGetRankingListRequest request = new DtkGetRankingListRequest();
        request.setPageId("1");
        request.setPageSize(20);
        request.setRankType(1);
        DtkApiResponse<List<DtkGetRankingListMergeResponse>> response = client.execute(request);
        System.out.println(JsonUtil.objectToJson(response));
    }
}
