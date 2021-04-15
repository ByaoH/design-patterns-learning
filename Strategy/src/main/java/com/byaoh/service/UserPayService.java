package com.byaoh.service;

import java.math.BigDecimal;

/**
 * 用于计算价钱
 *
 * @author luliangyu
 * @date 2021-04-15 16:42
 **/
public interface UserPayService {
    /**
     * 给定一个值，返回新值
     * @param orderPrice
     * @return
     */
    BigDecimal quote(BigDecimal orderPrice);
}
