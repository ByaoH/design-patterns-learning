package com.byaoh.service.impl;

import com.byaoh.service.UserPayService;
import com.byaoh.utils.UserPayServiceFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 普通用户 不打折
 *
 * @author luliangyu
 * @date 2021-04-15 17:51
 **/
@Service
public class DefaultUserPayService implements UserPayService, InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceFactory.register("DefaultUser", this);
    }
}
