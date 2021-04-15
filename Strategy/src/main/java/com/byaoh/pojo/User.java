package com.byaoh.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户
 *
 * @author luliangyu
 * @date 2021-04-15 17:59
 **/
@Data
@Accessors(chain = true)
public class User {
    private String vipType;
}
