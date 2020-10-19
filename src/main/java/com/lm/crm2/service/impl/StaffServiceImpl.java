package com.lm.crm2.service.impl;

import com.lm.crm2.controller.BaseController;
import com.lm.crm2.dao.StaffDao;
import com.lm.crm2.po.Staff;
import com.lm.crm2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 20:01
 */
@Service
public class StaffServiceImpl extends BaseController implements StaffService {

    @Autowired
    private StaffDao staffDao;

    @Override
    public Boolean registry(Staff staff) {
        //staff.setUserid(1);
        return staffDao.insertUser(staff);
    }

    /*@Override
    public List<Staff> check(String account) {
        return staffDao.checkAccount(account);
    }*/

    @Override
    public List<Staff> login(Staff staff) {
        return staffDao.logincheck(staff);
    }

    @Override
    public void changePwd(Staff staff) {
        this.staffDao.changePwd(staff);
    }

    @Override
    public Object getName(String account) {
        return staffDao.getName(account);
    }



    /*@Override
    public List<Staff> check() {
        return staffDao.checkAccount(account);
        *//*Staff staff = new Staff();
        List list = staffDao.checkAccount(staff.getAccount());
        Iterator a = list.iterator();
        String result = equals(a.next()==account)?"1":"2";
        return result;*//*
    }*/
}
