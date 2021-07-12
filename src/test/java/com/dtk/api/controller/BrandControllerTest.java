package com.dtk.api.controller;

import com.dtk.api.client.DtkApiClient;
import com.dtk.api.request.mastertool.*;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.mastertool.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * test
 *
 * @author 1
 * @date 2020/11/30 17:48
 */
@SpringBootTest
class BrandControllerTest {

    @Test
        //官方活动会场转链请求参数实体
    void dtkActivityLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkActivityLinkRequest request = new DtkActivityLinkRequest();
        request.setVersion("v1.0.0");
        request.setPromotionSceneId("");
        DtkApiResponse<DtkActivityLinkResponse> execute = client.execute(request);
    }

    @Test
        //商品精推素材请求参数实体
    void dtkCommodityMaterialsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCommodityMaterialsRequest request = new DtkCommodityMaterialsRequest();
        request.setVersion("v1.0.0");
        request.setId("");
        DtkApiResponse<List<DtkCommodityMaterialsResponse>> execute = client.execute(request);
    }

    @Test
        //优惠券查询请求参数实体
    void dtkCouponQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCouponQueryRequest request = new DtkCouponQueryRequest();
        request.setVersion("v1.0.0");
        request.setContent("");
        DtkApiResponse<DtkCouponQueryResponse> execute = client.execute(request);
    }

    @Test
        //淘口令生成请求参数实体
    void dtkCreatTaokoulingRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCreatTaokoulingRequest request = new DtkCreatTaokoulingRequest();
        request.setVersion("v1.0.0");
        request.setUrl("");
        DtkApiResponse<DtkCreatTaokoulingResponse> execute = client.execute(request);
    }

    @Test
        //超值买返商品转链请求参数实体
    void dtkCzmfTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCzmfTransformLinkRequest request = new DtkCzmfTransformLinkRequest();
        request.setVersion("v1.0.0");
        request.setGoodsId("");
        DtkApiResponse<DtkCzmfTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //首单礼金商品请求参数实体
    void dtkFirstOrderGiftMoneyRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkFirstOrderGiftMoneyRequest request = new DtkFirstOrderGiftMoneyRequest();
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkPageResponse<DtkFirstOrderGiftMoneyResponse>> execute = client.execute(request);
    }

    @Test
        //我的收藏请求参数实体
    void dtkGetCollectionListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetCollectionListRequest request = new DtkGetCollectionListRequest();
        request.setCid("");
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkPageResponse<DtkGetCollectionListItemResponse>> execute = client.execute(request);
    }

    @Test
        //淘系订单查询接口请求参数实体
    void dtkGetOrderDetailsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetOrderDetailsRequest request = new DtkGetOrderDetailsRequest();
        request.setQueryType(0);
        request.setStartTime("");
        request.setEndTime("");
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkPageResponse<DtkGetOrderDetailsResponse>> execute = client.execute(request);
    }

    @Test
        //我发布的商品请求参数实体
    void dtkGetOwnerGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetOwnerGoodsRequest request = new DtkGetOwnerGoodsRequest();
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkPageResponse<DtkGetOwnerGoodsItemResponse>> execute = client.execute(request);
    }

    @Test
        //高效转链请求参数实体
    void dtkGetPrivilegeLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetPrivilegeLinkRequest request = new DtkGetPrivilegeLinkRequest();
        request.setGoodsId("");
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkGetPrivilegeLinkResponse> execute = client.execute(request);
    }

    @Test
        //超级分类请求参数实体
    void dtkGetSuperCategoryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetSuperCategoryRequest request = new DtkGetSuperCategoryRequest();
        request.setVersion("v1.0.0");
        DtkApiResponse<List<DtkGetSuperCategoryResponse>> execute = client.execute(request);
    }

    @Test
        //商品评论请求参数实体
    void dtkGoodsCommentListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGoodsCommentListRequest request = new DtkGoodsCommentListRequest();
        request.setId(0);
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkGoodsCommentListResponse> execute = client.execute(request);
    }

    @Test
        //京东商品批量转链请求参数实体
    void dtkJdBatchTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdBatchTransformLinkRequest request = new DtkJdBatchTransformLinkRequest();
        request.setUnionId("0");
        request.setContent("");
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkJdBatchTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //京东商品转链请求参数实体
    void dtkJdCommodityTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdCommodityTransformLinkRequest request = new DtkJdCommodityTransformLinkRequest();
        request.setUnionId("");
        request.setMaterialId("");
        request.setVersion("v1.0.0");
        DtkApiResponse<DtkJdCommodityTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //京东链接解析请求参数实体
    void dtkJdLinkAnalysisRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdLinkAnalysisRequest request = new DtkJdLinkAnalysisRequest();
        request.setUrl("");
        request.setVersion("v1.0.0");
        client.execute(request);
    }

}