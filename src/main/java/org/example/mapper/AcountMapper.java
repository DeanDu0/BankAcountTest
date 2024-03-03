package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.dao.AcountPojo;

public interface AcountMapper {
    @Update("update tbl_acount set money=#{money} where id=#{id}")
    public void updateMethodAdd(AcountPojo acountPojo);

    @Select("select * from tbl_acount where id=#{id}")
    public AcountPojo getByID(Integer id);

}
