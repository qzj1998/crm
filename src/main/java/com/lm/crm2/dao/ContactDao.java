package com.lm.crm2.dao;

import com.lm.crm2.po.Contact;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:56
 */
public interface ContactDao {

    //不使用concat则改#为$,无需拼接，concat可避免sql注入
    @Select("select * from contact join customer on customer.cid=contact.cid " +
            "and contact.name like concat('%',#{name},'%')" +
            "and contact.sex like concat('%',#{sex},'%')" +
            "and customer.company like concat('%',#{company},'%') order by contact.id asc")
    List<Contact> searchContact(@Param("name") String name, @Param("sex") String sex, @Param("company") String company);

    //获取公司名称
    @Select("select * from customer where company like concat('%',#{company},'%')")
    List<Contact> getCompany(String company);

    @Delete("delete from contact where id = #{id}")
    Boolean deleteById(int id);

    @Select("select cid from customer where company = #{company}")
    int getCid(String company);

    @Insert("insert into contact (name,sex,office_phone,cell_phone,cid) " +
            "values(#{name},#{sex},#{office_phone},#{cell_phone},#{cid})")
    Boolean addContact(Contact contact);

    @Select("select * from contact join customer on customer.cid=contact.cid and contact.id = #{id}")
    List<Contact> getAllById(int id);

    @Update("update contact set name=#{name},sex=#{sex},office_phone=#{office_phone},cell_phone=#{cell_phone},cid=#{cid} where id=#{id}")
    Boolean modify(Contact contact);
}


