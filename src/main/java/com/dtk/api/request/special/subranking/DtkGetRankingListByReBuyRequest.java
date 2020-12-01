package com.dtk.api.request.special.subranking;

import com.dtk.api.client.DtkApiRequest;
import com.dtk.api.response.base.DtkApiResponse;
import com.dtk.api.response.special.subranking.DtkGetRankingListByReBuyResponse;
import com.dtk.api.utils.ObjectUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.TreeMap;

/**
 * 各大榜单4(复购榜)请求参数实体
 *
 * @author baige
 * @date 2020/11/25 17:08
 */
@Getter
@Setter
public class DtkGetRankingListByReBuyRequest extends DtkGetRankingListBaseRequest implements DtkApiRequest<DtkApiResponse<List<DtkGetRankingListByReBuyResponse>>> {
    @Override
    public TreeMap<String, String> getTextParams() throws IllegalAccessException {
        return ObjectUtil.objToMap(this);
    }

    @Override
    public String apiVersion() {
        return super.getVersion();
    }

    @Override
    public TypeReference<DtkApiResponse<List<DtkGetRankingListByReBuyResponse>>> responseType() {
        return new TypeReference<DtkApiResponse<List<DtkGetRankingListByReBuyResponse>>>() {
        };
    }

    @Override
    public DtkGetRankingListByReBuyRequest customUrl(String requestUrl) {
        this.setRequestUrl(requestUrl);
        return this;
    }

    @Override
    public String requestUrl() {
        return this.getRequestUrl();
    }
}
