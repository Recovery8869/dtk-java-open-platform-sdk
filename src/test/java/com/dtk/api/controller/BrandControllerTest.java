package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.special.DtkGetBrandGoodsListRequest;
import com.dtk.api.request.special.DtkGetColumnListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.special.DtkGetBrandGoodsListResponse;
import com.dtk.api.response.special.DtkGetColumnListResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 17:48
 */
@SpringBootTest
class BrandControllerTest {

    @Test
    void getColumnList() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetColumnListRequest request = new DtkGetColumnListRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/delanys/brand/get-column-list");
        request.setVersion("v1.0.0");
        request.setCid(6);
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkDiffPageResponse<DtkGetColumnListResponse>> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }

    @Test
    void getGoodsList() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetBrandGoodsListRequest request = new DtkGetBrandGoodsListRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/delanys/brand/get-goods-list");
        request.setVersion("v1.0.0");
        request.setBrandId("7625988");
        request.setPageId("1");
        request.setPageSize(20);
        DtkApiResponse<DtkGetBrandGoodsListResponse> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}