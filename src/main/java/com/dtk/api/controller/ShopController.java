package com.dtk.api.controller;

import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.mastertool.DtkShopConvertRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.mastertool.DtkShopConvertResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dtk api: Shop controller
 *
 * @author baige
 * @date 2020/11/13 16:25
 */
@RestController
@RequestMapping("/api/dels/shop")
public class ShopController extends BaseController {

    @GetMapping("/convert")
    @ApiOperation("店铺转链API")
    public DtkApiResponse<DtkShopConvertResponse> getShopConvertInfo(DtkShopConvertRequest dtkShopConvertRequest) {
        return getDtkClient().execute(dtkShopConvertRequest);
    }
}
