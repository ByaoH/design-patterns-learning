package com.byaoh.utils;

import com.byaoh.service.UserPayService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author luliangyu
 * @date 2021-04-15 17:35
 **/
public class UserPayServiceFactory {
    private static Map<String, UserPayService> services = new ConcurrentHashMap<>();

    public static UserPayService getByUserType(String type) {
        return services.get(type);
    }

    public static void register(String userType, UserPayService userPayService) {
        services.put(userType, userPayService);
    }

    protected UserPayServiceFactory() {
    }
}
