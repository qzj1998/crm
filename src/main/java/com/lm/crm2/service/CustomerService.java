package com.lm.crm2.service;

import com.lm.crm2.po.Customer;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:48
 */
public interface CustomerService {
    public List<Customer> getData();

    public Boolean checkCompany(String company);

    public Boolean addCust(Customer customer);

    public List<Customer> selectByCid(int cid);

    public Boolean updateC(Customer customer);

    public int deleteCustomer(int cid);

    public List<Customer> search(String company);

}
