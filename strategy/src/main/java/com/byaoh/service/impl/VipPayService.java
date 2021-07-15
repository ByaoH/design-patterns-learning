package com.byaoh.service.impl;

import com.byaoh.enums.RateEnum;
import com.byaoh.service.UserPayService;
import com.byaoh.utils.UserPayServiceFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 普通会员 9折
 *
 * @author luliangyu
 * @date 2021-04-15 17:07
 **/
@Service
public class VipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.doubleValue() > RateEnum.RATE_NUM.getRete()) {
            return orderPrice.multiply(BigDecimal.valueOf(0.9D));
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceFactory.register("VipPay", this);
    }
}
