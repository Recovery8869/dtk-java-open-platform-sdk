package com.dtk.api.controller;

import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.mastertool.DtkGoodsCommentListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkGoodsCommentListResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dtk api: comment controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/comment")
public class CommentController extends BaseController {

    @GetMapping("/get-comment-list")
    @ApiOperation("商品评论API")
    public DtkApiResponse<DtkGoodsCommentListResponse> getCommentList(DtkGoodsCommentListRequest dtkGoodsCommentListRequest) {
        return getDtkClient().execute(dtkGoodsCommentListRequest);
    }
}
