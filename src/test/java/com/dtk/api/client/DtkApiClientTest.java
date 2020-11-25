package com.dtk.api.client;

import com.dtk.api.request.special.DtkActivityCatalogueRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.request.mastertool.DtkParseContentRequest;
import com.dtk.api.request.putstorage.DtkGoodsListRequest;
import com.dtk.api.request.special.DtkGetRankingListRequest;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.mastertool.DtkParseContentResponse;
import com.dtk.api.response.putstorage.DtkGoodsListItemResponse;
import com.dtk.api.response.special.DtkActivityCatalogueResponse;
import com.dtk.api.response.special.DtkGetRankingListNewResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 1
 * @date 2020/11/11 9:23
 */
@SpringBootTest
@Slf4j
class DtkApiClientTest {
    @Test
    void getRankingList() {
        DtkClient dtkClient = DtkApiClient.getInstance("fffffffffffff", "test");
        DtkGetRankingListRequest dtkGoodsListRequest = new DtkGetRankingListRequest();
        // url
        dtkGoodsListRequest.setUrl("https://openapi.haojiequ.com/java_op_test/api/goods/get-ranking-list");
        dtkGoodsListRequest.setPageId("1");
        dtkGoodsListRequest.setRankType(7);
        // ...
        DtkApiResponse<List<DtkGetRankingListNewResponse>> execute = dtkClient.execute(dtkGoodsListRequest);
        if (execute.isSuccess()) {
            // 逻辑
        }
    }

    @Test
    void getGoodsList() {
        DtkClient dtkClient = DtkApiClient.getInstance("test", "test");
        DtkGoodsListRequest dtkGoodsListRequest = new DtkGoodsListRequest();
        // url
        dtkGoodsListRequest.setUrl("https://openapi.haojiequ.com/java_op_test/api/goods/get-goods-list");
        dtkGoodsListRequest.setPageId("1");
        // ...
        DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> execute = dtkClient.execute(dtkGoodsListRequest);
    }

    @Test
    void parseContent() {
        DtkClient dtkClient = DtkApiClient.getInstance("test", "test");
        DtkParseContentRequest dtkParseContentRequest = new DtkParseContentRequest();
        // url
        dtkParseContentRequest.setUrl("https://openapi.haojiequ.com/java_op_test/api/tb-service/parse-content");
        dtkParseContentRequest.setContent("1");
        // ...
        DtkApiResponse<DtkParseContentResponse> execute = dtkClient.execute(dtkParseContentRequest);
    }

    @Test
    void getActivityCatalogue() {
        DtkActivityCatalogueRequest dtkActivityCatalogueRequest = new DtkActivityCatalogueRequest();
        dtkActivityCatalogueRequest.setUrl("https://openapi.haojiequ.com/api/goods/activity/catalogue");
        DtkClient dtkClient = DtkApiClient.getInstance("test", "test");
        DtkApiResponse<List<DtkActivityCatalogueResponse>> execute = dtkClient.execute(dtkActivityCatalogueRequest);
        if (execute.isSuccess()) {
            System.out.println("success");
        }
    }

}