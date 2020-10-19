package com.lm.crm2.service;

import com.lm.crm2.po.Visit;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/11 16:50
 */
public interface VisitService {

    List<Visit> getContactN();

    List<Visit> getN(String company);

    List<Visit> getCompanyV(String name);

    List<Visit> checkCN(int cid, int id);

    List<Visit> getStaff();

    Boolean addVisit(Visit visit);

    List<Visit> searchV(Timestamp mintime, Timestamp maxtime);

    List<Visit> getById(int vid);

    Boolean modifyV(Visit visit);

    Boolean delByVid(int vid);
}
