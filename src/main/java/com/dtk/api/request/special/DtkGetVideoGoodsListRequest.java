package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.request.base.DtkPageParamRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.base.DtkDiffPageResponse;
import com.dtk.api.response.special.DtkGetVideoGoodsListResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 短视频商品请求参数实体
 *
 * @author baige
 * @date 2020/11/30 16:57
 */
@Getter
@Setter
public class DtkGetVideoGoodsListRequest extends DtkPageParamRequest implements DtkApiRequest<DtkApiResponse<DtkDiffPageResponse<DtkGetVideoGoodsListResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v1.0.0")
    private String version = "v1.0.0";
    @ApiModelProperty(value = "短视频分类id")
    private Integer cid;

    @Override
    public Map<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<DtkDiffPageResponse<DtkGetVideoGoodsListResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<DtkDiffPageResponse<DtkGetVideoGoodsListResponse>>>() {
        };
    }

    @Override
    public String requestUrl() {
        return this.getUrl();
    }

    @Override
    public DtkGetVideoGoodsListRequest customUrl(String url) {
        this.setUrl(url);
        return this;
    }
}
