package com.lm.crm2.service.impl;

import com.lm.crm2.dao.ContactDao;
import com.lm.crm2.po.Contact;
import com.lm.crm2.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:57
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> searchContact(String name, String sex, String company) {
        return contactDao.searchContact(name, sex, company);
    }

    @Override
    public List<Contact> getCompany(String company) {
        return contactDao.getCompany(company);
    }

    @Override
    public Boolean deleteById(int id) {
        return contactDao.deleteById(id);
    }

    @Override
    public int getCid(String company) {
        return contactDao.getCid(company);
    }

    @Override
    public Boolean addContact(Contact contact) {
        return contactDao.addContact(contact);
    }

    @Override
    public List<Contact> getAllById(int id) {
        return contactDao.getAllById(id);
    }

    @Override
    public Boolean modify(Contact contact) {
        return contactDao.modify(contact);
    }
}
