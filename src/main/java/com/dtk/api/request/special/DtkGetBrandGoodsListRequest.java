package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.request.base.DtkPageParamRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.special.DtkGetBrandGoodsListResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 品牌商品列表请求参数实体
 *
 * @author baige
 * @date 2020/11/30 17:43
 */
@Getter
@Setter
public class DtkGetBrandGoodsListRequest extends DtkPageParamRequest implements DtkApiRequest<DtkApiResponse<DtkGetBrandGoodsListResponse>> {
    @ApiModelProperty(value = "版本号", example = "v1.0.0")
    private String version = "v1.0.0";
    @ApiModelProperty(value = "品牌id")
    private String brandId;

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<DtkGetBrandGoodsListResponse>> responseType() {
        return new TypeReference<DtkApiResponse<DtkGetBrandGoodsListResponse>>() {
        };
    }

    @Override
    public String requestUrl() {
        return this.getUrl();
    }

    @Override
    public DtkGetBrandGoodsListRequest customUrl(String url) {
        this.setUrl(url);
        return this;
    }
}
