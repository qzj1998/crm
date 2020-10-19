package com.lm.crm2.service;

import com.lm.crm2.po.Staff;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 20:01
 */
public interface StaffService {

    public Boolean registry(Staff staff);

    /*public List<Staff> check(String account);*/

    public List<Staff> login(Staff staff);

    public void changePwd(Staff staff);

    public Object getName(String account);

}
