package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.request.base.DtkPageParamRequest;
import com.dtk.api.response.base.DtkPageResponse;
import com.dtk.api.response.special.DtkJdOneDollarPurchaseResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 京东一元购请求参数实体
 *
 * @author 1
 * @date 2020/11/10 18:12
 */
@Getter
@Setter
public class DtkJdOneDollarPurchaseRequest extends DtkPageParamRequest implements DtkApiRequest<DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v1.0.0")
    private String version = "v1.0.0";
    @ApiModelProperty(value = "大淘客的一级分类id，如果需要传多个，以英文逗号相隔，如：”1,2,3”")
    private String cids;
    @ApiModelProperty(value = "排序方式，默认为0，0-综合排序，5-价格（券后价）从高到低，6-价格（券后价）从低到高")
    private String sort;

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<DtkPageResponse<DtkJdOneDollarPurchaseResponse>>>() {
        };
    }

    @Override
    public DtkJdOneDollarPurchaseRequest customUrl(String url) {
        this.setUrl(url);
        return this;
    }

    @Override
    public String requestUrl() {
        return this.getUrl();
    }
}
