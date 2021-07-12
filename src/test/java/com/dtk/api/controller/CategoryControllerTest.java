package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.mastertool.DtkGetSuperCategoryRequest;
import com.dtk.api.request.search.DtkGetTop100Request;
import com.dtk.api.request.special.DtkDdqGoodsListRequest;
import com.dtk.api.request.special.DtkGetTbTopicListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkGetSuperCategoryResponse;
import com.dtk.api.response.search.DtkGetTop100Response;
import com.dtk.api.response.special.DtkDdqGoodsListResponse;
import com.dtk.api.response.special.DtkGetTbTopicListResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 15:47
 */
@SpringBootTest
class CategoryControllerTest {

    @Test
    void getHotSearch() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, appSecret);
        DtkGetTop100Request request = new DtkGetTop100Request();
        //("https://openapi.dataoke.com/api/category/get-top100");
        request.setVersion("v1.0.1");
        DtkApiResponse<DtkGetTop100Response> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }

    @Test
    void getSuperCategory() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, appSecret);
        DtkGetSuperCategoryRequest request = new DtkGetSuperCategoryRequest();
        //("https://openapi.dataoke.com/api/category/get-super-category");
        request.setVersion("v1.1.0");
        DtkApiResponse<List<DtkGetSuperCategoryResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }

    @Test
    void getDdqGoodsList() {
        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
        DtkDdqGoodsListRequest request = new DtkDdqGoodsListRequest();
        //("https://openapi.dataoke.com/api/category/ddq-goods-list");
        request.setVersion("v1.1.0");
        request.setRoundTime("2020-10-10 00:00:00");
        DtkApiResponse<DtkDdqGoodsListResponse> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }

    @Test
    void getTbTopicList() {
        DtkApiClient client = DtkApiClient.getInstance("appKey", "appSecret");
        DtkGetTbTopicListRequest request = new DtkGetTbTopicListRequest();
        //("https://openapi.dataoke.com/api/category/ddq-goods-list");
        request.setVersion("v1.1.0");
        request.setPageId("1");
        request.setPageSize(20);
        request.setChannelId("xxx");
        DtkApiResponse<List<DtkGetTbTopicListResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}