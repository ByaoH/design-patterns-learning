package com.byaoh;

import com.byaoh.pojo.User;
import com.byaoh.service.UserPayService;
import com.byaoh.utils.UserPayServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luliangyu
 * @date 2021-04-15 18:00
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Test
    public void test() {
        User defaultUser = new User().setVipType("DefaultUser");
        User particularlyVip = new User().setVipType("ParticularlyVip");
        User superVipPay = new User().setVipType("SuperVipPay");
        User vipPay = new User().setVipType("VipPay");
        Map<String, User> map = new HashMap<>();
        map.put("defaultUser", defaultUser);
        map.put("particularlyVip", particularlyVip);
        map.put("superVipPay", superVipPay);
        map.put("vipPay", vipPay);
        map.entrySet().forEach(stringUserEntry -> {
            UserPayService byUserType = UserPayServiceFactory.getByUserType(stringUserEntry.getValue().getVipType());
            BigDecimal quote = byUserType.quote(BigDecimal.valueOf(100D));
            log.info("100 >>>{}>> {}", byUserType.getClass(), quote.doubleValue());
        });
    }

}
