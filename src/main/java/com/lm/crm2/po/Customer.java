package com.lm.crm2.po;

import lombok.Data;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 14:34
 */
@Data
public class Customer {
    private int cid;
    private String company;
    private String level;
    private String source;
    private String industry;//行业
    private Long phone;
    private Long mobile_phone;
}
