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
        request.setPromotionSceneId("20150318020002192");
        request.setPid("mm_27399943_1915200219_110990500489");
        request.setRelationId("0");
        request.setUnionId("0");
        DtkApiResponse<DtkActivityLinkResponse> execute = client.execute(request);
    }

    @Test
        //商品精推素材请求参数实体
    void dtkCommodityMaterialsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCommodityMaterialsRequest request = new DtkCommodityMaterialsRequest();
        request.setVersion("v1.0.0");
        request.setId("1");
        DtkApiResponse<List<DtkCommodityMaterialsResponse>> execute = client.execute(request);
    }

    @Test
        //优惠券查询请求参数实体
    void dtkCouponQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCouponQueryRequest request = new DtkCouponQueryRequest();
        request.setVersion("v1.0.0");
        request.setContent("https://detail.tmall.com/item.htm?spm=a230r.1.14.4.3b014bb1PkrElh&id=630464637415&cm_id=140105335569ed55e27b&abbucket=13");  //√
        DtkApiResponse<DtkCouponQueryResponse> execute = client.execute(request);
    }

    @Test
        //淘口令生成请求参数实体
    void dtkCreatTaokoulingRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCreatTaokoulingRequest request = new DtkCreatTaokoulingRequest();
        request.setVersion("v1.0.0");
        request.setText("xxxxx");
        request.setUrl("https://uland.taobao.com/quan/detail?sellerId=3697149989&activityId=1a199c15098b43b9a9cd4f287dc172f0");     //√
        request.setLogo("xxx");
        request.setUserId("xxx");
        DtkApiResponse<DtkCreatTaokoulingResponse> execute = client.execute(request);
    }

    @Test
        //超值买返商品转链请求参数实体
    void dtkCzmfTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkCzmfTransformLinkRequest request = new DtkCzmfTransformLinkRequest();
        request.setVersion("v1.0.0");
        request.setGoodsId("532777426471");
        request.setTitle("众知堂三伏贴膏正品三伏灸贴穴位贴敷膏药贴儿童成人三伏贴同仁堂");
        request.setPid("mm_27399943_1915200219_110990500489");
        request.setRelationId("https://www.taobao.com");
        request.setCouponId("12");
        DtkApiResponse<DtkCzmfTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //首单礼金商品请求参数实体
    void dtkFirstOrderGiftMoneyRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkFirstOrderGiftMoneyRequest request = new DtkFirstOrderGiftMoneyRequest();
        request.setVersion("v1.0.0");
        request.setPageSize(10);
        request.setPageId("2");
        request.setCids("1,2,3");
        request.setSort("1");
        request.setKeyWord("帽子");
        request.setGoodsType(1);
        DtkApiResponse<DtkPageResponse<DtkFirstOrderGiftMoneyResponse>> execute = client.execute(request);
    }

    @Test
        //我的收藏请求参数实体
    void dtkGetCollectionListRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetCollectionListRequest request = new DtkGetCollectionListRequest();
        request.setVersion("v1.0.0");
        request.setPageId("1");
        request.setCid("2");
        request.setPageSize(100);
        request.setTrailerType(0);
        request.setSort("0");
        request.setCollectionTimeOrder(10);
        DtkApiResponse<DtkPageResponse<DtkGetCollectionListItemResponse>> execute = client.execute(request);
    }

    @Test
        //淘系订单查询接口请求参数实体
    void dtkGetOrderDetailsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetOrderDetailsRequest request = new DtkGetOrderDetailsRequest();
        request.setVersion("v1.0.0");
        request.setQueryType(3);
        request.setStartTime("2021-07-13 11:30:00");
        request.setEndTime("2021-07-13 12:00:00");
        request.setPositionIndex("1626147000_|1626150601_");
        request.setPageSize(20);
        request.setMemberType(2);
        request.setTkStatus(12);
        request.setJumpType(1);
        request.setPageNo(1);
        request.setOrderScene(1);
        DtkApiResponse<DtkPageResponse<DtkGetOrderDetailsResponse>> execute = client.execute(request);
    }

    @Test
        //我发布的商品请求参数实体
    void dtkGetOwnerGoodsRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetOwnerGoodsRequest request = new DtkGetOwnerGoodsRequest();
        request.setVersion("v1.0.0");
        request.setPageId("1");
        request.setPageSize(100);
        request.setOnline(0);
        request.setStartTime("2021-07-13 13:00:00");
        request.setEndTime("2021-07-13 13:30:00");
        request.setSort("0");
        DtkApiResponse<DtkPageResponse<DtkGetOwnerGoodsItemResponse>> execute = client.execute(request);
    }

    @Test
        //高效转链请求参数实体
    void dtkGetPrivilegeLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkGetPrivilegeLinkRequest request = new DtkGetPrivilegeLinkRequest();
        request.setVersion("1.3.0");
        request.setGoodsId("523962011119");
        request.setPid("mm_27399943_1915200219_110990500489");
        request.setCouponId("34632179");
        request.setChannelId("https://www.taobao.com");
        request.setRebateType(0);
        request.setSpecialId("123");
        request.setExternalId("123");
        request.setXid("123");
        request.setLeftSymbol("￥");
        request.setRightSymbol("￥");
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
        request.setVersion("v1.0.0");
        request.setId(123456);

        request.setGoodsId("1456785412");
        request.setType(0);
        request.setSort(0);
        request.setHaopingType(0);
        DtkApiResponse<DtkGoodsCommentListResponse> execute = client.execute(request);
    }

    @Test
        //京东商品批量转链请求参数实体
    void dtkJdBatchTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdBatchTransformLinkRequest request = new DtkJdBatchTransformLinkRequest();
        request.setVersion("v1.0.0");
        request.setUnionId("0");
        request.setContent("领1699-300元劵 http://coupon.m.jd.com/coupons/show.action?key=c1m9cbsfodaf4e6d917d0d3dbb66c566&roleId=51299139");
        request.setPositionId(Long.valueOf(10));
        request.setChildPid("xxx");
        request.setSubUnionId("xxx_1");
        DtkApiResponse<DtkJdBatchTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //京东商品转链请求参数实体
    void dtkJdCommodityTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdCommodityTransformLinkRequest request = new DtkJdCommodityTransformLinkRequest();
        request.setVersion("v1.0.0");
        request.setUnionId("10000");
        request.setMaterialId("https://item.jd.com/26581197392.html");
        request.setPositionId(Long.valueOf(10));
        request.setChildPid("xxx");
        request.setSubUnionId("xxx_1");
        request.setCouponUrl("https://item.jd.com/68893247676.html");
        request.setChainType(1);
        request.setGiftCouponKey("10");
        DtkApiResponse<DtkJdCommodityTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //京东链接解析请求参数实体
    void dtkJdLinkAnalysisRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdLinkAnalysisRequest request = new DtkJdLinkAnalysisRequest();
        request.setVersion("v1.0.0");
        request.setUrl("https://miaosha.jd.com/#100017623378.html");
        DtkApiResponse<DtkJdLinkAnalysisResponse> execute = client.execute(request);
    }

    @Test
        //京东订单查询请求参数实体
    void dtkJdOrderQueryRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkJdOrderQueryRequest request = new DtkJdOrderQueryRequest();
        request.setVersion("v1.0.0");
        request.setType("2");
        request.setKey("b57733a7028b09011b3d8bf5cb79f48b2da69d56d3f88df");
        request.setStartTime("2020-11-01 01:00:00");
        request.setEndTime("2020-11-01 02:00:00");
        request.setPageNo(1);
        request.setPageSize(100);
        request.setChildUnionId("0");
        request.setFields("goodsInfo");
        DtkApiResponse<DtkPageResponse<List<DtkJdOrderQueryResponse>>> execute = client.execute(request);
    }

    @Test
        //三合一红包接口请求参数实体
    void dtkMergeRedEnvelopesRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkMergeRedEnvelopesRequest request = new DtkMergeRedEnvelopesRequest();
        request.setVersion("v1.0.0");
        request.setMerchantType(1);
        request.setUnionId("xxx");
        request.setPid("xxx");
        DtkApiResponse<DtkMergeRedEnvelopesResponse> execute = client.execute(request);
    }

    @Test
        //淘系万能解析请求参数实体
    void dtkParseContentRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkParseContentRequest request = new DtkParseContentRequest();
        request.setVersion("v1.0.0");
        request.setContent("领券下单链接：https://s.click.taobao.com/lHlLAxu");
        DtkApiResponse<DtkParseContentResponse> execute = client.execute(request);
    }

    @Test
        //淘口令解析请求参数实体
    void dtkParseTaokoulingRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkParseTaokoulingRequest request = new DtkParseTaokoulingRequest();
        request.setVersion("v1.0.0");
        request.setContent("复制这段描述￥s3QN1y1t3qDu￥");
        DtkApiResponse<DtkParseContentResponse> execute = client.execute(request);
    }

    @Test
        //拼多多商品转链请求参数实体
    void dtkPddTransformLinkRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkPddTransformLinkRequest request = new DtkPddTransformLinkRequest();
        request.setVersion("v1.0.0");
        request.setPid("xxx");
        request.setGoodsSign("c9_2jIGD8q9HeEqRwvfY5A2CBcK7_JOFdnZa6o");
        request.setCustomParameters("\"uid\":\"11111\",\"sid\":\"22222\"");
        request.setZsDuoId("10");
        DtkApiResponse<DtkPddTransformLinkResponse> execute = client.execute(request);
    }

    @Test
        //店铺转链请求参数实体
    void dtkShopConvertRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkShopConvertRequest request = new DtkShopConvertRequest();
        request.setVersion("v1.0.0");
        request.setSellerId("1111111111");
        request.setPid("xxx");
        request.setShopName("1");
        request.setRelationId("1");
        DtkApiResponse<DtkShopConvertResponse> execute = client.execute(request);
    }

    @Test
        //淘礼金创建请求参数实体
    void dtkTbCashGiftRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkTbCashGiftRequest request = new DtkTbCashGiftRequest();
        request.setVersion("v1.0.0");
        request.setAlimamaAppKey("https://survey.taobao.com/apps/zhiliao/BQ2RPRlpU");
        request.setAlimamaAppSecret("xxxx");
        request.setName("xxx");
        request.setItemId("xxx_1");
        request.setPerFace("10.00");
        request.setTotalNum(1);
        request.setWinNumLimit(1);
        request.setSendStartTime("2021-07-15 16:00:00");
        request.setSendEndTime("2021-07-15 16:40:00");
        request.setPid("mm_27399943_1915200219_110990500489");
        request.setCampaignType(1);
        request.setUseEndTimeMode("1");
        request.setUseStartTime("3");
        request.setUserEndTime("3");
        DtkApiResponse<DtkTbCashGiftResponse> execute = client.execute(request);
    }

    @Test
        //淘口令转淘口令请求参数实体
    void DtkTwdToTwdRequest() {
        DtkApiClient client = DtkApiClient.getInstance(AppKeyConstant.appKey, AppKeyConstant.appSecret);
        DtkTwdToTwdRequest request = new DtkTwdToTwdRequest();
        request.setVersion("v1.0.0");
        request.setContent("复制这条信息，打开手机淘宝领券下单(4j9ZXjl7pel):/");
        request.setPid("mm_27399943_1915200219_110990500489");
        request.setChannelId("0");
        request.setSpecial_id("0");
        request.setExternal_id("0");
        DtkApiResponse<DtkTwdToTwdResponse> execute = client.execute(request);
    }
}