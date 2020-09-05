package com.example.demo.mapper;

import com.example.demo.module.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    @Insert("insert into user (account_id, name, token,gmt_create,gmt_modified ) values ( #{accountId}, #{name}, #{token},#{gmtCreate},#{gmtModified} );")
    void insert(User user);

    @Select("SELECT * from user WHERE token = #{token};")
    User findByToken(@Param("token") String token);
}


