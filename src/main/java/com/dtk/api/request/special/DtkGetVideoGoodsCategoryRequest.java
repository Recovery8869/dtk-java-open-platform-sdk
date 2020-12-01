package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.request.base.DtkUrlParamRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsCategoryResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * 短视频商品分类请求参数实体
 *
 * @author baige
 * @date 2020/11/30 17:11
 */
@Getter
@Setter
public class DtkGetVideoGoodsCategoryRequest extends DtkUrlParamRequest implements DtkApiRequest<DtkApiResponse<List<DtkGetVideoGoodsCategoryResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v1.0.0")
    private String version = "v1.0.0";

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<List<DtkGetVideoGoodsCategoryResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<List<DtkGetVideoGoodsCategoryResponse>>>() {
        };
    }

    @Override
    public String requestUrl() {
        return this.getRequestUrl();
    }

    @Override
    public DtkGetVideoGoodsCategoryRequest customUrl(String requestUrl) {
        this.setRequestUrl(requestUrl);
        return this;
    }
}
