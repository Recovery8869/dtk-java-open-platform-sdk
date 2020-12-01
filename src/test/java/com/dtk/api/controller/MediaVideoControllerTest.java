package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.special.DtkGetVideoGoodsCategoryRequest;
import com.dtk.api.request.special.DtkGetVideoGoodsListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsCategoryResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsListResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.dtk.api.controller.AppKeyConstant.appKey;
import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 17:15
 */
@SpringBootTest
class MediaVideoControllerTest {

    @Test
    void getVideoCategoryList() {
        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
        DtkGetVideoGoodsCategoryRequest request = new DtkGetVideoGoodsCategoryRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/delanys/media/video/get-category-list");
        request.setVersion("v1.0.0");
        DtkApiResponse<List<DtkGetVideoGoodsCategoryResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }

    @Test
    void getVideoList() {
        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
        DtkGetVideoGoodsListRequest request = new DtkGetVideoGoodsListRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/delanys/media/video/get-goods-list");
        request.setVersion("v1.0.0");
        request.setCid(15);
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkDiffPageResponse<DtkGetVideoGoodsListResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}