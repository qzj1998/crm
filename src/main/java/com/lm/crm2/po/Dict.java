package com.lm.crm2.po;

import lombok.Data;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 20:44
 */
@Data
public class Dict {
    private int did;
    private int dictid;
    private String type_m;
    private String dict;
    private String type;
    private int powerid;
    private String username;
    private String password;
    private String name;
    private String powerlevel;
    private String state;
    private List<String> array;
}
