package com.lm.crm2.dao;

import com.lm.crm2.po.Visit;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/11 16:49
 */
public interface VisitDao {

    @Select("select * from contact")
    List<Visit> getContactN();

    @Select("select * from contact join customer on customer.cid=contact.cid and customer.company=#{company}")
    List<Visit> getN(String company);

    @Select("select * from customer")
    List<Visit> getCompanyV(String name);

    @Select("select * from customer join contact on customer.cid=contact.cid and (customer.cid=#{cid}||contact.id=#{id})")
    List<Visit> checkCN(@Param("cid") int cid, @Param("id") int id);

    @Select("select * from staff")
    List<Visit> getStaff();

    @Insert("insert into visit (time,place,details,id,cid,userid) values(#{time},#{place},#{details},#{id},#{cid},#{userid})")
    Boolean addVisit(Visit visit);

    @Select("select * from ((visit left join contact on visit.id=contact.id)" +
            "left join customer on visit.cid=customer.cid)" +
            "left join staff on visit.userid=staff.userid " +
            "where visit.time between #{mintime} and #{maxtime} order by visit.time desc")
    List<Visit> searchV(@Param("mintime") Timestamp mintime, @Param("maxtime") Timestamp maxtime);

    @Select("select * from ((visit left join contact on visit.id=contact.id)" +
            "left join customer on visit.cid=customer.cid)" +
            "left join staff on visit.userid=staff.userid " +
            "where visit.vid=#{vid}")
    List<Visit> getById(int vid);

    @Update("update visit set time=#{time},place=#{place},details=#{details},id=#{id},cid=#{cid},userid=#{userid} where vid = #{vid}")
    Boolean modifyV(Visit visit);

    @Delete("delete from visit where vid=#{vid}")
    Boolean delByVid(int vid);
}
