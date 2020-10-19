package com.lm.crm2.po;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Liumin
 * @Date: 2019/11/11 16:42
 */
@Data
public class Visit {
    private int vid;
    private Timestamp time;
    private String place;
    private String details;
    private int id;
    private String name;
    private String company;
    private int userid;
    private int cid;
    private String account;

    private Timestamp mintime;
    private Timestamp maxtime;
    private String username;
}
