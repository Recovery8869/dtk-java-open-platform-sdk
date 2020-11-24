package com.dtk.api.controller;

import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.special.DtkGetRankListRequest;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * dtk api: subdivision controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/subdivision")
public class SubdivisionController extends BaseController {

    @GetMapping("/get-rank-list")
    @ApiOperation("细分类目榜API")
    public DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>> getRankList(DtkGetRankListRequest dtkGetRankListRequest) {
        return getDtkClient().execute(dtkGetRankListRequest.customUrl(getRequestUrl()));
    }
}
