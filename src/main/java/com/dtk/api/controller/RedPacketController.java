package com.dtk.api.controller;

import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.controller.base.BaseController;
import com.dtk.api.request.mastertool.DtkMergeRedEnvelopesRequest;
import com.dtk.api.response.mastertool.DtkMergeRedEnvelopesResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dtk api: Dels controller
 *
 * @author baige
 * @date 2020/11/13 16:25
 */
@RestController
@RequestMapping("/api/dels")
public class RedPacketController extends BaseController {

    @GetMapping("/merge-red-envelopes")
    @ApiOperation("三合一红包接口API")
    public DtkApiResponse<DtkMergeRedEnvelopesResponse> mergeRedEnvelopes(DtkMergeRedEnvelopesRequest dtkMergeRedEnvelopesRequest) {
        return getDtkClient().execute(dtkMergeRedEnvelopesRequest.customUrl(getRequestUrl()));
    }
}
