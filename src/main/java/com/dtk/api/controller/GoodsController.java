package com.dtk.api.controller;

import com.dtk.api.client.DtkClient;
import com.dtk.api.controller.base.BaseController;
import com.dtk.api.exception.DtkApiException;
import com.dtk.api.exception.DtkResultEnum;
import com.dtk.api.request.mastertool.DtkFirstOrderGiftMoneyRequest;
import com.dtk.api.request.mastertool.DtkGetCollectionListRequest;
import com.dtk.api.request.mastertool.DtkGetOwnerGoodsRequest;
import com.dtk.api.request.putstorage.*;
import com.dtk.api.request.search.DtkGetDtkSearchGoodsRequest;
import com.dtk.api.request.search.DtkListSuperGoodsRequest;
import com.dtk.api.request.search.DtkSearchSuggestionRequest;
import com.dtk.api.request.special.*;
import com.dtk.api.request.special.subranking.*;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.mastertool.DtkFirstOrderGiftMoneyResponse;
import com.dtk.api.response.mastertool.DtkGetCollectionListItemResponse;
import com.dtk.api.response.mastertool.DtkGetOwnerGoodsItemResponse;
import com.dtk.api.response.putstorage.*;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import com.dtk.api.response.search.DtkListSuperGoodsResponse;
import com.dtk.api.response.search.DtkSearchSuggestionResponse;
import com.dtk.api.response.special.*;
import com.dtk.api.utils.Assert;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * dtk api: goods controller
 *
 * @author baige
 * @date 2020/11/13 14:04
 */
@RestController
@RequestMapping("/api/goods")
public class GoodsController extends BaseController {

    @GetMapping("/get-goods-list")
    @ApiOperation("商品列表API")
    public DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> getGoodsList(DtkGoodsListRequest dtkGoodsListRequest) {
        return getDtkClient().execute(dtkGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/pull-goods-by-time")
    @ApiOperation("定时拉取API")
    public DtkApiResponse<DtkPageResponse<DtkGoodsListItemResponse>> getGoodsInfo(DtkPullGoodsByTimeRequest dtkPullGoodsByTimeRequest) {
        return getDtkClient().execute(dtkPullGoodsByTimeRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-newest-goods")
    @ApiOperation("商品更新API")
    public DtkApiResponse<DtkPageResponse<DtkNewestGoodsResponse>> getNewestGoodsList(DtkNewestGoodsRequest dtkNewestGoodsRequest) {
        return getDtkClient().execute(dtkNewestGoodsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-goods-details")
    @ApiOperation("单品详情API")
    public DtkApiResponse<DtkGoodsDetailsResponse> getGoodsDetails(DtkGoodsDetailsRequest dtkGoodsDetailsRequest) {
        return getDtkClient().execute(dtkGoodsDetailsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-stale-goods-by-time")
    @ApiOperation("失效商品API")
    public DtkApiResponse<DtkPageResponse<DtkStaleGoodsByTimeResponse>> getStaleGoodsByTime(DtkStaleGoodsByTimeRequest dtkStaleGoodsByTimeRequest) {
        return getDtkClient().execute(dtkStaleGoodsByTimeRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-owner-goods")
    @ApiOperation("我发布的商品API")
    public DtkApiResponse<DtkPageResponse<DtkGetOwnerGoodsItemResponse>> getOwnerGoods(DtkGetOwnerGoodsRequest dtkGetOwnerGoodsRequest) {
        return getDtkClient().execute(dtkGetOwnerGoodsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-collection-list")
    @ApiOperation("我的收藏API")
    public DtkApiResponse<DtkPageResponse<DtkGetCollectionListItemResponse>> getCollectionList(DtkGetCollectionListRequest dtkGetCollectionListRequest) {
        return getDtkClient().execute(dtkGetCollectionListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("get-dtk-search-goods")
    @ApiOperation("大淘客搜索API")
    public DtkApiResponse<DtkPageResponse<DtkGetDtkSearchGoodsResponse>> getDtkGoodsSearchGoods(DtkGetDtkSearchGoodsRequest dtkGetDtkSearchGoodsRequest) {
        return getDtkClient().execute(dtkGetDtkSearchGoodsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/search-suggestion")
    @ApiOperation("联想词API")
    public DtkApiResponse<List<DtkSearchSuggestionResponse>> searchSuggestion(DtkSearchSuggestionRequest dtkSearchSuggestionRequest) {
        return getDtkClient().execute(dtkSearchSuggestionRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/list-super-goods")
    @ApiOperation("超级搜索API")
    public DtkApiResponse<DtkPageResponse<DtkListSuperGoodsResponse>> listSuperGoods(DtkListSuperGoodsRequest dtkListSuperGoodsRequest) {
        return getDtkClient().execute(dtkListSuperGoodsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/nine/op-goods-list")
    @ApiOperation("9.9包邮精选API")
    public DtkApiResponse<DtkPageResponse<DtkOpGoodsListResponse>> getOpApiNineGoodsList(DtkOpGoodsListRequest dtkOpGoodsListRequest) {
        return getDtkClient().execute(dtkOpGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-ranking-list")
    @ApiOperation("各大榜单API")
    public Object getRankingList(DtkGetRankingListRequest dtkGetRankingListRequest) {
        Integer rankType = dtkGetRankingListRequest.getRankType();
        Assert.notNull(rankType, DtkResultEnum.RANK_TYPE_ERROR);
        DtkClient dtkClient = getDtkClient();
        switch (rankType) {
            case 1:
            case 2:
            case 3:
                DtkGetRankingListByTimeWholeHotRequest dtkGetRankingListByTimeWholeHotRequest = new DtkGetRankingListByTimeWholeHotRequest();
                BeanUtils.copyProperties(dtkGetRankingListRequest, dtkGetRankingListByTimeWholeHotRequest);
                return dtkClient.execute(dtkGetRankingListByTimeWholeHotRequest.customUrl(getRequestUrl()));
            case 4:
                DtkGetRankingListByReBuyRequest dtkGetRankingListByReBuyRequest = new DtkGetRankingListByReBuyRequest();
                BeanUtils.copyProperties(dtkGetRankingListRequest, dtkGetRankingListByReBuyRequest);
                return dtkClient.execute(dtkGetRankingListByReBuyRequest.customUrl(getRequestUrl()));
            case 5:
                DtkGetRankingListByHotWordUpRequest dtkGetRankingListByHotWordUpRequest = new DtkGetRankingListByHotWordUpRequest();
                BeanUtils.copyProperties(dtkGetRankingListRequest, dtkGetRankingListByHotWordUpRequest);
                return dtkClient.execute(dtkGetRankingListByHotWordUpRequest.customUrl(getRequestUrl()));
            case 6:
                DtkGetRankingListByHotWordRequest dtkGetRankingListByHotWordRequest = new DtkGetRankingListByHotWordRequest();
                BeanUtils.copyProperties(dtkGetRankingListRequest, dtkGetRankingListByHotWordRequest);
                return dtkClient.execute(dtkGetRankingListByHotWordRequest.customUrl(getRequestUrl()));
            case 7:
                DtkGetRankingListByHotSearchRequest dtkGetRankingListByHotSearchRequest = new DtkGetRankingListByHotSearchRequest();
                BeanUtils.copyProperties(dtkGetRankingListRequest, dtkGetRankingListByHotSearchRequest);
                return dtkClient.execute(dtkGetRankingListByHotSearchRequest.customUrl(getRequestUrl()));
            default:
                throw new DtkApiException(DtkResultEnum.RANK_TYPE_ERROR);
        }
    }

    @GetMapping("/list-similer-goods-by-open")
    @ApiOperation("猜你喜欢API")
    public DtkApiResponse<List<DtkListSimilerGoodsByOpenResponse>> listSimilerGoods(DtkListSimilerGoodsByOpenRequest dtkListSimilerGoodsByOpenRequest) {
        return getDtkClient().execute(dtkListSimilerGoodsByOpenRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/topic/catalogue")
    @ApiOperation("精选专题API")
    public DtkApiResponse<List<DtkCatalogueResponse>> topicCatalogue(DtkCatalogueRequest dtkCatalogueRequest) {
        return getDtkClient().execute(dtkCatalogueRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/topic/goods-list")
    @ApiOperation("专题商品API")
    public DtkApiResponse<DtkPageResponse<DtkBaseItemResponse>> topicList(DtkTopicGoodsListRequest dtkGoodsListRequest) {
        return getDtkClient().execute(dtkGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/activity/catalogue")
    @ApiOperation("热门活动API")
    public DtkApiResponse<List<DtkActivityCatalogueResponse>> activityCatalogue(DtkActivityCatalogueRequest dtkActivityCatalogueRequest) {
        return getDtkClient().execute(dtkActivityCatalogueRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/activity/goods-list")
    @ApiOperation("活动商品API")
    public DtkApiResponse<DtkPageResponse<DtkActivityGoodsListResponse>> activityGoodsList(DtkActivityGoodsListRequest dtkActivityGoodsListRequest) {
        return getDtkClient().execute(dtkActivityGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/friends-circle-list")
    @ApiOperation("朋友圈文案API")
    public DtkApiResponse<DtkPageResponse<DtkFriendsCircleListResponse>> friendsCircleList(DtkFriendsCircleListRequest dtkFriendsCircleListRequest) {
        return getDtkClient().execute(dtkFriendsCircleListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/first-order-gift-money")
    @ApiOperation("首单礼金商品API")
    public DtkApiResponse<DtkFirstOrderGiftMoneyResponse> firstOrderGiftMoneyGoods(DtkFirstOrderGiftMoneyRequest dtkFirstOrderGiftMoneyRequest) {
        return getDtkClient().execute(dtkFirstOrderGiftMoneyRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/exclusive-goods-list")
    @ApiOperation("大淘客独家券商品API")
    public DtkApiResponse<DtkPageResponse<DtkExclusiveGoodsListResponse>> exclusiveGoodsList(DtkExclusiveGoodsListRequest dtkExclusiveGoodsListRequest) {
        return getDtkClient().execute(dtkExclusiveGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/explosive-goods-list")
    @ApiOperation("每日爆品推荐API")
    public DtkApiResponse<DtkPageResponse<DtkExplosiveGoodsListResponse>> explosiveGoods(DtkExplosiveGoodsListRequest dtkExclusiveGoodsListRequest) {
        return getDtkClient().execute(dtkExclusiveGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/liveMaterial-goods-list")
    @ApiOperation("直播好货API")
    public DtkApiResponse<DtkPageResponse<DtkLiveMaterialGoodsListResponse>> liveMaterialGoods(DtkLiveMaterialGoodsListRequest dtkLiveMaterialGoodsListRequest) {
        return getDtkClient().execute(dtkLiveMaterialGoodsListRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/price-trend")
    @ApiOperation("商品历史券后价API")
    public DtkApiResponse<DtkPriceTrendResponse> priceTrend(DtkPriceTrendRequest dtkPriceTrendRequest) {
        return getDtkClient().execute(dtkPriceTrendRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/super-discount-goods")
    @ApiOperation("折上折API")
    public DtkApiResponse<DtkPageResponse<DtkGetDtkSearchGoodsResponse>> getSuperDiscount(DtkSuperDiscountGoodsRequest dtkSuperDiscountGoodsRequest) {
        return getDtkClient().execute(dtkSuperDiscountGoodsRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/get-half-price-day")
    @ApiOperation("每日半价API")
    public DtkApiResponse<DtkGetHalfPriceDayResponse> getHalfPriceDay(DtkGetHalfPriceDayRequest dtkGetHalfPriceDayRequest) {
        return getDtkClient().execute(dtkGetHalfPriceDayRequest.customUrl(getRequestUrl()));
    }

    @GetMapping("/jd-one-dollar-purchase")
    @ApiOperation("京东一元购API")
    public DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseResponse>> jdOneDollarPurchase(DtkJdOneDollarPurchaseRequest dtkJdOneDollarPurchaseRequest) {
        return getDtkClient().execute(dtkJdOneDollarPurchaseRequest.customUrl(getRequestUrl()));
    }
}
