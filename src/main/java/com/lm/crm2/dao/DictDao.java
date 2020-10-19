package com.lm.crm2.dao;

import com.lm.crm2.po.Dict;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: Liumin
 * @Date: 2019/11/6 20:44
 */
public interface DictDao {
    @Select("select * from dict_m join dictionary on dictionary.`dictid`=dict_m.`dictid` and dict_m.`type_m`='性别' and dict_m.`state`='启用'")
    List<Dict> getSex();


    @Select("select * from staff join power_p on staff.account= #{account} and staff.powerid=power_p.powerid")
    List<Dict> checkPower(String account);

    @Select("select * from dict_m order by type_m asc")
    List<Dict> getDictM();


    @Insert("insert into dict_m (type_m,state) values(#{type_m},#{state})")
    void addM(@Param("type_m") String type_m, @Param("state") String state);

    @Insert("insert into dictionary (dict,dictid) values(#{dict},(select dictid from dict_m where type_m=#{type_m}))")
    void addD(@Param("dict") String dict, @Param("type_m") String type_m);

    @Select("select * from dictionary join dict_m on dictionary.dictid=dict_m.dictid and dict_m.dictid=#{dictid} order by dictionary.did asc")
    List<Dict> getToM(@Param("dictid") int dictid);

    @Update("update dict_m set type_m=#{type_m},state=#{state} where dictid=#{dictid}")
//更新字典类型及状态
    void modifyDM(@Param("type_m") String type_m, @Param("state") String state, @Param("dictid") int dictid);

    @Update("update dictionary set dict=#{dict} where did=#{did}")
//更新字典项值
    void modifyD(@Param("dict") String dict, @Param("did") int did);

    @Select("select  did from dictionary where dictid=#{dictid}")
//查did遍历
    List<Integer> getDid(@Param("dictid") int dictid);

    @Insert("insert into dictionary (dict,dictid) values (#{dict},#{dictid})")
//修改时新增
    void addToM(@Param("dict") String dict, @Param("dictid") int dictid);

    @Delete("delete from dict_m where dictid=#{dictid}")
    Boolean delDM(int dictid);

    @Delete("delete from dictionary where did=#{did}")
    Boolean delOld(int did);
}
