package com.dtk.api.controller;


import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.special.DtkGetVideoGoodsCategoryRequest;
import com.dtk.api.request.special.DtkGetVideoGoodsListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsCategoryResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsListResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * dtk api: MediaVideo controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/delanys/media/video")
public class MediaVideoController extends BaseController {

    @GetMapping("/get-category-list")
    @ApiOperation("短视频商品分类API")
    public DtkApiResponse<List<DtkGetVideoGoodsCategoryResponse>> getVideoCategoryList(DtkGetVideoGoodsCategoryRequest dtkGetVideoGoodsCategoryRequest) {
        return getDtkClient().execute(dtkGetVideoGoodsCategoryRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-goods-list")
    @ApiOperation("短视频商品API")
    public DtkApiResponse<DtkDiffPageResponse<DtkGetVideoGoodsListResponse>> getVideoList(DtkGetVideoGoodsListRequest dtkGetVideoGoodsListRequest) {
        return getDtkClient().execute(dtkGetVideoGoodsListRequest.customUrl(getRequestUrl()));
    }
}
