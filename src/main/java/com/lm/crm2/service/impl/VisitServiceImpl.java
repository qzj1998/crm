package com.lm.crm2.service.impl;

import com.lm.crm2.dao.VisitDao;
import com.lm.crm2.po.Visit;
import com.lm.crm2.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/11 16:50
 */
@Service
public class VisitServiceImpl implements VisitService {
    @Autowired
    private VisitDao visitDao;

    @Override
    public List<Visit> getContactN() {
        return visitDao.getContactN();
    }

    @Override
    public List<Visit> getN(String company) {
        return visitDao.getN(company);
    }

    @Override
    public List<Visit> getCompanyV(String name) {
        return visitDao.getCompanyV(name);
    }

    @Override
    public List<Visit> checkCN(int cid, int id) {
        return visitDao.checkCN(cid, id);
    }

    @Override
    public List<Visit> getStaff() {
        return visitDao.getStaff();
    }

    @Override
    public Boolean addVisit(Visit visit) {
        return visitDao.addVisit(visit);
    }

    @Override
    public List<Visit> searchV(Timestamp mintime, Timestamp maxtime) {
        return visitDao.searchV(mintime, maxtime);
    }

    @Override
    public List<Visit> getById(int vid) {
        return visitDao.getById(vid);
    }

    @Override
    public Boolean modifyV(Visit visit) {
        return visitDao.modifyV(visit);
    }

    @Override
    public Boolean delByVid(int vid) {
        return visitDao.delByVid(vid);
    }
}
