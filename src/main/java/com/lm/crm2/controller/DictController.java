package com.lm.crm2.controller;

import com.lm.crm2.po.Dict;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 20:46
 */
@RestController
public class DictController extends BaseController {
    @GetMapping("/getSex")
    public List<Dict> getSex() {
        return dictService.getSex();
    }

    @GetMapping("/checkPower")
    public List<Dict> checkPower(String account) {
        return dictService.checkPower(account);
    }

    @PostMapping("/addDict")
    public void addDict(String state, String type_m, @RequestParam("list") List<String> list) {
        dictService.addDict(state, type_m, list);
    }

    @GetMapping("/getDictM")
    public List<Dict> getDictM() {
        return dictService.getDictM();
    }

    @GetMapping("/getToM")
    public List<Dict> getToM(int dictid) {
        return dictService.getToM(dictid);
    }

    @PutMapping("/modifyDict")
    public void modify(@RequestParam("list") List<String> list, @RequestParam(value = "array", required = false) List<String> array, String state, String type_m, int dictid) {
        dictService.modify(list, array, state, type_m, dictid);
    }

    @DeleteMapping("/deleteDM")
    public Boolean delDM(int dictid) {
        return dictService.delDM(dictid);
    }

    @DeleteMapping("/delOld")
    public Boolean delOld(int did) {
        return dictService.delOld(did);
    }
}
