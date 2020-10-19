package com.lm.crm2.service.impl;

import com.lm.crm2.dao.DictDao;
import com.lm.crm2.po.Dict;
import com.lm.crm2.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 20:45
 */
@Service
public class DictServieImpl implements DictService {
    @Autowired
    private DictDao dIctDao;

    @Override
    public List<Dict> getSex() {
        return dIctDao.getSex();
    }

    @Override
    public List<Dict> checkPower(String account) {
        return dIctDao.checkPower(account);
    }

    @Override
    public List<Dict> getDictM() {
        return dIctDao.getDictM();
    }

    @Override
    public void addDict(String state, String type_m, List<String> list) {
        this.dIctDao.addM(type_m, state);
        for (String dict : list) {
            if (!dict.equals("")) {
                dIctDao.addD(dict, type_m);
            }
        }
    }

    @Override
    public List<Dict> getToM(int dictid) {
        return dIctDao.getToM(dictid);
    }

    @Override
    public void modify(List<String> list, List<String> array, String state, String type_m, int dictid) {
        dIctDao.modifyDM(type_m, state, dictid);
        List list3 = dIctDao.getDid(dictid);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list3.size(); j++) {
                if (i == j) {
                    dIctDao.modifyD(list.get(i), (int) list3.get(j));
                }
            }
        }
        if (array != null) {
            for (String dict :
                    array) {
                if (!dict.equals("")) {
                    dIctDao.addToM(dict, dictid);
                }
            }
        }
    }

    @Override
    public Boolean delDM(int dictid) {
        return dIctDao.delDM(dictid);
    }

    @Override
    public Boolean delOld(int did) {
        return dIctDao.delOld(did);
    }

}
