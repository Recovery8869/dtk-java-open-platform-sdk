package com.dtk.api.response.mastertool;

import com.dtk.api.response.base.DtkPageResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 首单礼金商品响应结果实体
 *
 * @author 1
 * @date 2020/11/11 16:17
 */
@Getter
@Setter
public class DtkFirstOrderGiftMoneyResponse extends DtkPageResponse<DtkFirstOrderGiftMoneyItemResponse> {
    @ApiModelProperty(value = "首单礼金淘口令")
    private String model1;
    @ApiModelProperty(value = "备用礼金淘口令")
    private String model2;
}
