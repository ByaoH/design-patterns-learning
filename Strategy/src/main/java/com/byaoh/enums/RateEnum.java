package com.byaoh.enums;

import lombok.Getter;

/**
 * 计算打折的值
 *
 * @author luliangyu
 * @date 2021-04-15 18:13
 **/
@Getter
public enum RateEnum {
    RATE_NUM(30);
    private int rete;

    RateEnum(int rete) {
        this.rete = rete;
    }
}
