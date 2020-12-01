package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.mastertool.DtkMergeRedEnvelopesRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkMergeRedEnvelopesResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.dtk.api.controller.AppKeyConstant.appKey;
import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 11:11
 */
@SpringBootTest
class RedPacketControllerTest {

    @Test
    void mergeRedEnvelopes() {
        DtkApiClient client = DtkApiClient.getInstance(appKey, appSecret);
        DtkMergeRedEnvelopesRequest request = new DtkMergeRedEnvelopesRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/dels/merge-red-envelopes");
        request.setVersion("v1.0.0");
        request.setMerchantType(1);
        request.setPid("123123");
        request.setUnionId("123123");
        DtkApiResponse<DtkMergeRedEnvelopesResponse> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
            System.out.println("");
        }
    }
}