package com.lm.crm2.po;

import lombok.Data;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 14:33
 */
@Data
public class Staff {
    private int userid;
    private String account;//账号
    private String password;
    private String username;
    private int powerid;
}
