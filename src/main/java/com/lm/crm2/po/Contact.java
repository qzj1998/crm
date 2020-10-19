package com.lm.crm2.po;

import lombok.Data;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 14:37
 */

@Data
//联系人为客户公司员工
public class Contact {
    private int id;
    private String company;
    private String name;
    private String sex;
    private Long office_phone;
    private Long cell_phone;
    private int cid;
}
