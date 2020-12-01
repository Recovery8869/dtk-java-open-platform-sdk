package com.dtk.api.request.search;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.request.base.DtkUrlParamRequest;
import com.dtk.api.response.search.DtkGetTbServiceResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * 联盟搜索请求参数实体
 *
 * @author 1
 * @date 2020/11/10 18:10
 */
@Getter
@Setter
public class DtkGetTbServiceRequest extends DtkUrlParamRequest implements DtkApiRequest<DtkApiResponse<List<DtkGetTbServiceResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v2.1.0")
    private String version = "v2.1.0";
    @ApiModelProperty(value = "第几页，默认1", required = true, example = "1")
    private Long pageNo;
    @ApiModelProperty(value = "每页条数， 默认20，范围值1~100", required = true, example = "20")
    private Long pageSize;
    @ApiModelProperty(value = "查询词", required = true)
    private String keyWords;
    @ApiModelProperty(value = "排序指标：销量（total_sales），淘客佣金比率（tk_rate）， 累计推广量（tk_total_sales），总支出佣金（tk_total_commi），价格（price）,排序方式：排序_des（降序），排序_asc（升序）,示例：升序查询销量：total_sales_asc")
    private String sort;
    @ApiModelProperty(value = "是否商城商品，设置为1表示该商品是属于淘宝商城商品，设置为非1或不设置表示不判断这个属性（和overseas字段冲突，若已请求source，请勿再请求overseas）")
    private Integer source;
    @ApiModelProperty(value = "是否海外商品，设置为1表示该商品是属于海外商品，设置为非1或不设置表示不判断这个属性（和source字段冲突，若已请求overseas，请勿再请求source）")
    private Integer overseas;
    @ApiModelProperty(value = "折扣价范围上限，单位：元")
    private Long endPrice;
    @ApiModelProperty(value = "折扣价范围下限，单位：元")
    private Long startPrice;
    @ApiModelProperty(value = "媒体淘客佣金比率下限，如：1234表示12.34%")
    private Long startTkRate;
    @ApiModelProperty(value = "商品筛选-淘客佣金比率上限，如：1234表示12.34%")
    private Long endTkRate;
    @ApiModelProperty(value = "是否有优惠券，设置为true表示该商品有优惠券，设置为false或不设置表示不判断这个属性")
    private Boolean hasCoupon;
    @ApiModelProperty(value = "会员运营id")
    private String specialId;
    @ApiModelProperty(value = "渠道id将会和传入的pid进行验证，验证通过将正常转链，请确认填入的渠道id是正确的")
    private String channelId;

    @Override
    public DtkGetTbServiceRequest customUrl(String requestUrl) {
        this.setRequestUrl(requestUrl);
        return this;
    }

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<List<DtkGetTbServiceResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<List<DtkGetTbServiceResponse>>>() {
        };
    }

    @Override
    public String requestUrl() {
        return this.getRequestUrl();
    }
}
