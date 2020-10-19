package com.lm.crm2.controller;

import com.lm.crm2.po.Visit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/11 16:49
 */
@RestController
public class VisitController extends BaseController {
    @GetMapping("/getContactN")
    public List<Visit> getContactN() {
        return visitService.getContactN();
    }

    @GetMapping("/getN")
    public List<Visit> getN(String company) {
        return visitService.getN(company);
    }

    @GetMapping("/getCompanyV")
    public List<Visit> getCompany(String name) {
        return visitService.getCompanyV(name);
    }

    @GetMapping("/checkCN")
    public List<Visit> checkCN(int cid, int id) {
        return visitService.checkCN(cid, id);
    }

    @GetMapping("/getStaff")
    public List<Visit> getStaff() {
        return visitService.getStaff();
    }

    @PostMapping("/addVisit")
    public Boolean addVisit(Visit visit) {
        return visitService.addVisit(visit);
    }

    @GetMapping("/searchV")
    public List<Visit> searchV(Timestamp mintime, Timestamp maxtime) {
        return visitService.searchV(mintime, maxtime);
    }

    @GetMapping("/getByVid")
    public List<Visit> getById(int vid) {
        return visitService.getById(vid);
    }

    @PutMapping("/modifyV")
    public Boolean modifyV(Visit visit) {
        return visitService.modifyV(visit);
    }

    @DeleteMapping("/delByVid")
    public Boolean delByVid(int vid) {
        return visitService.delByVid(vid);
    }
}
