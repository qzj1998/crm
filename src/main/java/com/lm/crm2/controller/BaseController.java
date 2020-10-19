package com.lm.crm2.controller;

import com.lm.crm2.dao.StaffDao;
import com.lm.crm2.service.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Liumin
 * @Date: 2019/10/24 14:53
 */
public class BaseController {
    /*@Autowired
    protected StaffDao staffDao;*/

    @Autowired
    protected StaffService staffService;

    @Autowired
    protected CustomerService customerService;

    @Autowired
    protected ContactService contactService;

    @Autowired
    protected DictService dictService;

    @Autowired
    protected VisitService visitService;
}
