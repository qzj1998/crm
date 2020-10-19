package com.lm.crm2.dao;

import com.lm.crm2.po.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/10/29 10:46
 */
public interface CustomerDao {

    @Select("select * from customer")
    List<Customer> getData();

    @Select("select * from customer where company=#{company}")
    Boolean checkCompany(String company);

    @Insert("insert into customer (company,level,source,industry,phone,mobile_phone) values (#{company},#{level},#{source},#{industry},#{phone},#{mobile_phone})")
    Boolean addCustomer(Customer customer);

    @Select("select * from customer where cid = #{cid}")
    List<Customer> selectByCid(int cid);

    @Update("update customer set company=#{company},level=#{level},source=#{source},industry=#{industry},phone=#{phone},mobile_phone = #{mobile_phone} where cid = #{cid}")
    Boolean updateC(Customer customer);

    @Delete("delete from customer where cid = #{cid}")
    int deleteCustomer(int cid);

    //查询
    @Select("select * from customer where company like concat('%',#{company},'%')")
    List<Customer> searchByC(String company);

}
