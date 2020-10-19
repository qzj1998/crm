package com.lm.crm2.service;

import com.lm.crm2.po.Contact;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:55
 */
public interface ContactService {
    public List<Contact> searchContact(String name, String sex, String company);

    public List<Contact> getCompany(String company);

    public Boolean deleteById(int id);

    public int getCid(String company);

    public Boolean addContact(Contact contact);

    public List<Contact> getAllById(int id);

    public Boolean modify(Contact contact);
}
