package com.dtk.api.response.special;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author:YSH
 * @date: 2021/7/8
 * @time: 17:29
 */
@Getter
@Setter
public class DtkSubdivisionCategoryListResponse {
    private List<ListInfo> list;

    @Data
    private static class ListInfo {
        private String id;
        private String name;
    }
}
