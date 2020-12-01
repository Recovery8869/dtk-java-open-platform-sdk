package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.client.DtkClient;
import com.dtk.api.request.mastertool.DtkGoodsCommentListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkGoodsCommentListResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.dtk.api.controller.AppKeyConstant.appKey;
import static com.dtk.api.controller.AppKeyConstant.appSecret;

/**
 * test
 *
 * @author baige
 * @date 2020/11/30 10:42
 */
@SpringBootTest
@Slf4j
class CommentControllerTest {

    @Test
    void getCommentList() {
        DtkClient client = DtkApiClient.getInstance(appKey, appSecret);
        DtkGoodsCommentListRequest request = new DtkGoodsCommentListRequest();
        request.setRequestUrl("https://openapi.dataoke.com/api/comment/get-comment-list");
        request.setVersion("v1.0.0");
        request.setId(30713367);
        request.setGoodsId("617059027975");
        request.setType(0);
        DtkApiResponse<DtkGoodsCommentListResponse> execute = client.execute(request);
        if (execute.isSuccess()) {
            // 业务逻辑
        }
    }
}