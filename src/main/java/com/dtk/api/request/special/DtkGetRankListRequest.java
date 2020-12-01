package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.request.base.DtkUrlParamRequest;
import com.dtk.api.response.search.DtkGetDtkSearchGoodsResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * 细分类目榜请求实体参数
 *
 * @author 1
 * @date 2020/11/10 18:11
 */
@Getter
@Setter
public class DtkGetRankListRequest extends DtkUrlParamRequest implements DtkApiRequest<DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v1.0.0")
    private String version = "v1.0.0";
    @ApiModelProperty(value = "细分类目榜分类id（从商品详情获取）", required = true)
    private String subdivisionId;

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<List<DtkGetDtkSearchGoodsResponse>>>() {
        };
    }

    @Override
    public DtkGetRankListRequest customUrl(String requestUrl) {
        this.setRequestUrl(requestUrl);
        return this;
    }

    @Override
    public String requestUrl() {
        return this.getRequestUrl();
    }
}
