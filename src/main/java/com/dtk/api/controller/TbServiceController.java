package com.dtk.api.controller;

import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.mastertool.*;
import com.dtk.api.request.search.DtkGetTbServiceRequest;
import com.dtk.api.request.special.DtkGetBrandListRequest;
import com.dtk.api.response.mastertool.*;
import com.dtk.api.response.search.DtkGetTbServiceResponse;
import com.dtk.api.response.special.DtkGetBrandListResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * dtk api: tb-service controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/tb-service")
public class TbServiceController extends BaseController {

    @GetMapping("/get-privilege-link")
    @ApiOperation("高效转链API")
    public DtkApiResponse<DtkTwdToTwdResponse> getPrivilegeLink(DtkGetPrivilegeLinkRequest dtkGetPrivilegeLinkRequest) {
        return getDtkClient().execute(dtkGetPrivilegeLinkRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-tb-service")
    @ApiOperation("联盟搜索API")
    public DtkApiResponse<List<DtkGetTbServiceResponse>> getTbService(DtkGetTbServiceRequest dtkGetTbServiceRequest) {
        return getDtkClient().execute(dtkGetTbServiceRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-brand-list")
    @ApiOperation("品牌库API")
    public DtkApiResponse<List<DtkGetBrandListResponse>> getBrandList(DtkGetBrandListRequest dtkGetBrandListRequest) {
        return getDtkClient().execute(dtkGetBrandListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-order-details")
    @ApiOperation("订单查询接口API")
    public DtkApiResponse<DtkGetOrderDetailsResponse> getOrderDetails(DtkGetOrderDetailsRequest dtkGetOrderDetailsRequest) {
        return getDtkClient().execute(dtkGetOrderDetailsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/creat-taokouling")
    @ApiOperation("淘口令生成API")
    public DtkApiResponse<DtkCreatTaokoulingResponse> creatTpwd(DtkCreatTaokoulingRequest dtkCreatTaokoulingRequest) {
        return getDtkClient().execute(dtkCreatTaokoulingRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/activity-link")
    @ApiOperation("官方活动会场转链API")
    public DtkApiResponse<DtkActivityLinkResponse> activityLink(DtkActivityLinkRequest dtkActivityLinkRequest) {
        return getDtkClient().execute(dtkActivityLinkRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/twd-to-twd")
    @ApiOperation("淘口令转淘口令API")
    public DtkApiResponse<DtkTwdToTwdResponse> twdTotwd(DtkTwdToTwdRequest dtkTwdToTwdRequest) {
        return getDtkClient().execute(dtkTwdToTwdRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/parse-content")
    @ApiOperation("淘系万能解析API")
    public DtkApiResponse<DtkParseContentResponse> parseContent(DtkParseContentRequest dtkParseContentRequest) {
        return getDtkClient().execute(dtkParseContentRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/parse-taokouling")
    @ApiOperation("淘口令解析API")
    public DtkApiResponse<DtkParseContentResponse> parseTaoKouLing(DtkParseTaokoulingRequest dtkParseTaokoulingRequest) {
        return getDtkClient().execute(dtkParseTaokoulingRequest.customUrl(getRequestUrl()));
    }
}


