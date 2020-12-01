package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.mastertool.DtkShopConvertRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkShopConvertResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.dtk.api.controller.AppKeyConstant.appKey;
import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 11:05
 */
@SpringBootTest
@Slf4j
class ShopControllerTest {

    @Test
    void getShopConvertInfo() {
        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
        DtkShopConvertRequest request = new DtkShopConvertRequest();
        request.setUrl("https://openapi.dataoke.com/api/dels/shop/convert");
        request.setVersion("v1.0.0");
        request.setSellerId("234");
        request.setPid("234_123_123_123");
        request.setRelationId("234");
        request.setShopName("test");
        DtkApiResponse<DtkShopConvertResponse> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}