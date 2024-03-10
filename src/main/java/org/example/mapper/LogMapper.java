package org.example.mapper;

import org.apache.ibatis.annotations.Insert;

public interface LogMapper {
    @Insert("insert into tbl_log(info,createDate) values(#{info},now())")
    void log(String info);
}
