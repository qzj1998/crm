package com.lm.crm2.service.impl;

import com.lm.crm2.dao.CustomerDao;
import com.lm.crm2.po.Customer;
import com.lm.crm2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:49
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getData() {
        return customerDao.getData();
    }

    @Override
    public Boolean checkCompany(String company) {
        return customerDao.checkCompany(company);
    }

    @Override
    public Boolean addCust(Customer customer) {
        return customerDao.addCustomer(customer);
    }

    @Override
    public List<Customer> selectByCid(int cid) {
        return customerDao.selectByCid(cid);
    }

    @Override
    public Boolean updateC(Customer customer) {
        return customerDao.updateC(customer);
    }

    @Override
    public int deleteCustomer(int cid) {
        return customerDao.deleteCustomer(cid);
    }

    @Override
    public List<Customer> search(String company) {
        return customerDao.searchByC(company);
    }
}
