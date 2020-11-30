package com.dtk.api.controller;

import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.special.DtkGetBrandGoodsListRequest;
import com.dtk.api.request.special.DtkGetColumnListRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.special.DtkGetBrandGoodsListResponse;
import com.dtk.api.response.special.DtkGetColumnListResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dtk api: Brand controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/delanys/brand")
public class BrandController extends BaseController {

    @GetMapping("/get-column-list")
    @ApiOperation("品牌栏目API")
    public DtkApiResponse<DtkDiffPageResponse<DtkGetColumnListResponse>> getColumnList(DtkGetColumnListRequest dtkGetColumnListRequest) {
        return getDtkClient().execute(dtkGetColumnListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-goods-list")
    @ApiOperation("品牌商品列表API")
    public DtkApiResponse<DtkGetBrandGoodsListResponse> getGoodsList(DtkGetBrandGoodsListRequest dtkGetBrandGoodsListRequest) {
        return getDtkClient().execute(dtkGetBrandGoodsListRequest.customUrl(getRequestUrl()));
    }
}
