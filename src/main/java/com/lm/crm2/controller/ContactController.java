package com.lm.crm2.controller;

import com.lm.crm2.po.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 17:57
 */
@RestController
public class ContactController extends BaseController {

    @GetMapping("/searchContact")
    public List<Contact> searchContact(String name, String sex, String company) {
        return contactService.searchContact(name, sex, company);
    }

    @GetMapping("/getCompany")
    public List<Contact> getCompany(String company) {
        return contactService.getCompany(company);
    }

    @DeleteMapping("/deleteById")
    public Boolean deleteById(int id) {
        return contactService.deleteById(id);
    }

    @GetMapping("/getCid")
    public int getCid(String company) {
        return contactService.getCid(company);
    }

    @PostMapping("/addContact")
    public Boolean addContact(Contact contact) {
        return contactService.addContact(contact);
    }

    @GetMapping("/getAll")
    public List<Contact> getAll(int id) {
        return contactService.getAllById(id);
    }

    @PutMapping("/modify")
    public Boolean modify(Contact contact) {
        return contactService.modify(contact);
    }
}


