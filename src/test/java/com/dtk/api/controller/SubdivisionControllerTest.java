package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.client.DtkClient;
import com.dtk.api.request.special.DtkGetRankListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 18:18
 */
@SpringBootTest
class SubdivisionControllerTest {

    @Test
    void getRankList() {
        DtkClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetRankListRequest request = new DtkGetRankListRequest();
        //("https://openapi.dataoke.com/api/subdivision/get-rank-list");
        request.setVersion("v1.0.0");
        request.setSubdivisionId("xx");
        DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}