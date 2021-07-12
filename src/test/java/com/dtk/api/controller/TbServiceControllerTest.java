package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.mastertool.*;
import com.dtk.api.request.search.DtkGetTbServiceRequest;
import com.dtk.api.request.special.DtkGetBrandListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.*;
import com.dtk.api.response.search.DtkGetTbServiceResponse;
import com.dtk.api.response.special.DtkGetBrandListResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.dtk.api.controller.AppKeyConstant.appKey;
import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 11:19
 */
@SpringBootTest
class TbServiceControllerTest {
//
//    @Test
//    void getPrivilegeLink() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetPrivilegeLinkRequest request = new DtkGetPrivilegeLinkRequest();
//        //("https://openapi.dataoke.com/api/tb-service/get-privilege-link");
//        request.setVersion("v1.3.1");
//        request.setGoodsId("627769190428");
//        request.setCouponId("xxx");
//        request.setPid("xxx");
//        request.setChannelId("xxx");
//        request.setRebateType(0);
//        request.setSpecialId("xxx");
//        request.setExternalId("xxx");
//        request.setXid("xxx");
//        DtkApiResponse<DtkGetPrivilegeLinkResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getTbService() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetTbServiceRequest request = new DtkGetTbServiceRequest();
//        //("https://openapi.dataoke.com/api/tb-service/get-tb-service");
//        request.setVersion("v2.1.0");
//        request.setPageNo(1L);
//        request.setPageSize(20L);
//        request.setKeyWords("口罩");
//        request.setSort("total_sales_des");
//        request.setSource(1);
//        request.setOverseas(1);
//        request.setEndPrice(10L);
//        request.setStartPrice(5L);
//        request.setStartTkRate(1111L);
//        request.setEndTkRate(9999L);
//        request.setHasCoupon(Boolean.TRUE);
//        request.setSpecialId("xxx");
//        request.setChannelId("xxx");
//        DtkApiResponse<List<DtkGetTbServiceResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getBrandList() {
//        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
//        DtkGetBrandListRequest request = new DtkGetBrandListRequest();
//        //("https://openapi.dataoke.com/api/tb-service/get-brand-list");
//        request.setVersion("v1.1.2");
//        request.setPageId("1");
//        request.setPageSize(20);
//        DtkApiResponse<List<DtkGetBrandListResponse>> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void getOrderDetails() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkGetOrderDetailsRequest request = new DtkGetOrderDetailsRequest();
//        //("https://openapi.dataoke.com/api/tb-service/get-order-details");
//        request.setVersion("v1.0.0");
//        request.setPageNo(1);
//        request.setPageSize(20);
//        request.setQueryType(1);
//        request.setPositionIndex("xxx");
//        request.setMemberType(2);
//        request.setTkStatus(12);
//        request.setStartTime("2020-11-11 00:52:00");
//        request.setEndTime("2020-11-11 01:52:00");
//        request.setJumpType(1);
//        request.setOrderScene(1);
//        DtkApiResponse<DtkGetOrderDetailsResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void creatTpwd() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkCreatTaokoulingRequest request = new DtkCreatTaokoulingRequest();
//        //("https://openapi.dataoke.com/api/tb-service/creat-taokouling");
//        request.setVersion("v1.0.0");
//        request.setText("test");
//        request.setUrl("https://temai.m.taobao.com/");
//        // request.setUserId("xx");
//        // request.setLogo("xxx");
//        DtkApiResponse<DtkCreatTaokoulingResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void activityLink() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkActivityLinkRequest request = new DtkActivityLinkRequest();
//        //("https://openapi.dataoke.com/api/tb-service/activity-link");
//        request.setVersion("v1.0.0");
//        request.setPid("123_123_123_123");
//        request.setPromotionSceneId("20150318020000462");
//        request.setRelationId("123");
//        request.setUnionId("123");
//        DtkApiResponse<DtkActivityLinkResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void twdTotwd() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkTwdToTwdRequest request = new DtkTwdToTwdRequest();
//        //("https://openapi.dataoke.com/api/tb-service/twd-to-twd");
//        request.setVersion("v1.0.0");
//        request.setContent("1332233");
//        request.setPid("1332233");
//        request.setChannelId("1332233");
//        request.setSpecial_id("1332233");
//        request.setExternal_id("1332233");
//        DtkApiResponse<DtkTwdToTwdResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void parseContent() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkParseContentRequest request = new DtkParseContentRequest();
//        //("https://openapi.dataoke.com/api/tb-service/parse-content");
//        request.setVersion("v1.0.0");
//        request.setContent("test");
//        DtkApiResponse<DtkParseContentResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
//
//    @Test
//    void parseTaoKouLing() {
//        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
//        DtkParseTaokoulingRequest request = new DtkParseTaokoulingRequest();
//        //("https://openapi.dataoke.com/api/tb-service/parse-taokouling");
//        request.setVersion("v1.0.0");
//        request.setContent("xxx");
//        DtkApiResponse<DtkParseContentResponse> execute = client.execute(request);
//        if (execute.isSuccess()) {
//            // 业务逻辑
//        }
//    }
}