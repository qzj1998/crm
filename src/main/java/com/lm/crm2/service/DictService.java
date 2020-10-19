package com.lm.crm2.service;

import com.lm.crm2.po.Dict;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 20:45
 */
public interface DictService {
    public List<Dict> getSex();

    List<Dict> checkPower(String account);

    List<Dict> getDictM();

    void addDict(String state, String type_m, List<String> list);

    List<Dict> getToM(int dictid);

    void modify(List<String> list, List<String> array, String state, String type_m, int dictid);

    Boolean delDM(int dictid);

    Boolean delOld(int did);
}
