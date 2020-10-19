package com.lm.crm2.dao;

import com.lm.crm2.po.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 16:35
 */
public interface StaffDao {

    //注册
    @Insert("insert into staff (account,password,username,powerid) values (#{account},#{password},#{username},2)")
    Boolean insertUser(Staff staff);

    //账号注册校验账号
    /*@Select("select name from staff where account=#{account}")
    List<Staff> checkAccount(@Param("account")String account);*/
    /*@Select("select account from staff")
    List<Staff> checkAccount(String account);*/

    //登录校验
    @Select("select userId from staff where account=#{account} and password=#{password}")
    List<Staff> logincheck(Staff staff);

    //改密码
    @Update("update staff set password = #{password} where account = #{account}")
    void changePwd(Staff staff);

    //查姓名
    @Select("select username from staff where account = #{account}")
    Object getName(String account);


}
