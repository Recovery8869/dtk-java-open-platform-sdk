package com.dtk.api.controller;

import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.mastertool.DtkGetSuperCategoryRequest;
import com.dtk.api.request.search.DtkGetTop100Request;
import com.dtk.api.request.special.DtkDdqGoodsListRequest;
import com.dtk.api.request.special.DtkGetTbTopicListRequest;
import com.dtk.api.response.mastertool.DtkGetSuperCategoryResponse;
import com.dtk.api.response.search.DtkGetTop100Response;
import com.dtk.api.response.special.DtkDdqGoodsListResponse;
import com.dtk.api.response.special.DtkGetTbTopicListResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * dtk api: category controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController extends BaseController {

//    @GetMapping("/get-top100")
//    @ApiOperation("热搜记录Top100API")
//    public DtkApiResponse<DtkGetTop100Response> getHotSearch(DtkGetTop100Request dtkGetTop100Request) {
//        return getDtkClient().execute(dtkGetTop100Request.customUrl(getRequestUrl()));
//    }
//
//    @GetMapping("/get-super-category")
//    @ApiOperation("超级分类API")
//    public DtkApiResponse<List<DtkGetSuperCategoryResponse>> getSuperCategory(DtkGetSuperCategoryRequest dtkGetSuperCategoryRequest) {
//        return getDtkClient().execute(dtkGetSuperCategoryRequest.customUrl(getRequestUrl()));
//    }
//
//    @GetMapping("ddq-goods-list")
//    @ApiOperation("咚咚抢API")
//    public DtkApiResponse<DtkDdqGoodsListResponse> getDdqGoodsList(DtkDdqGoodsListRequest dtkDdqGoodsListRequest) {
//        return getDtkClient().execute(dtkDdqGoodsListRequest.customUrl(getRequestUrl()));
//    }
//
//    @GetMapping("get-tb-topic-list")
//    @ApiOperation("官方活动推广API")
//    public DtkApiResponse<List<DtkGetTbTopicListResponse>> getTbTopicList(DtkGetTbTopicListRequest dtkGetTbTopicListRequest) {
//        return getDtkClient().execute(dtkGetTbTopicListRequest.customUrl(getRequestUrl()));
//    }
}


