package com.lm.crm2.controller;

import com.lm.crm2.po.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:52
 */
@RestController
public class CustomerController extends BaseController {

    /*@GetMapping("/getCustomer")
    public List<Customer> getCustomer(){
        return customerService.getData();
    }*/

    @PostMapping("/checkCompany")
    public Boolean checkCompany(String company) {
        return customerService.checkCompany(company);
    }

    @PostMapping("/addCustomer")
    public Boolean addCust(Customer customer) {
        return customerService.addCust(customer);
    }

    @DeleteMapping("/deleteC")
    public int deleteC(int cid) {
        return customerService.deleteCustomer(cid);
    }

    @GetMapping("/selectC")
    public List<Customer> selectC(int cid) {
        return customerService.selectByCid(cid);
    }

    @PutMapping("/updateC")
    public Boolean updateByCid(Customer customer) {
        return customerService.updateC(customer);
    }

    @GetMapping("/search")
    public List<Customer> search(String company) {
        return customerService.search(company);
    }
}
