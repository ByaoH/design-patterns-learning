package com.byaoh.service.impl;

import com.byaoh.enums.RateEnum;
import com.byaoh.service.UserPayService;
import com.byaoh.utils.UserPayServiceFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 专属会员 7折
 *
 * @author luliangyu
 * @date 2021-04-15 16:51
 **/
@Service
public class ParticularlyVipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.doubleValue() > RateEnum.RATE_NUM.getRete()) {
            return orderPrice.multiply(BigDecimal.valueOf(0.7D));
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceFactory.register("ParticularlyVip", this);
    }
}
