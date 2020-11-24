package com.dtk.api.request.special;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.request.base.DtkPageParamRequest;
import com.dtk.api.response.special.DtkGetRankingListNewResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.TreeMap;

/**
 * 各大榜单请求参数实体
 *
 * @author 1
 * @date 2020/11/10 18:18
 */
@Getter
@Setter
public class DtkGetRankingListRequest extends DtkPageParamRequest implements DtkApiRequest<DtkApiResponse<List<DtkGetRankingListNewResponse>>> {
    @ApiModelProperty(value = "版本号", example = "v1.3.0")
    private String version = "v1.3.0";
    @ApiModelProperty(value = "榜单类型，1.实时榜 2.全天榜 3.热推榜 4.复购榜 5.热词飙升榜 6.热词排行榜 7.综合热搜榜", required = true)
    private Integer rankType;
    @ApiModelProperty(value = "大淘客一级类目id，仅对实时榜单、全天榜单有效")
    private Integer cid;

    @Override
    public TreeMap<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return this.version;
    }

    @Override
    public TypeReference<DtkApiResponse<List<DtkGetRankingListNewResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<List<DtkGetRankingListNewResponse>>>() {
        };
    }

    @Override
    public DtkGetRankingListRequest customUrl(String url) {
        this.setUrl(url);
        return this;
    }

    @Override
    public String requestUrl() {
        return this.getUrl();
    }
}
