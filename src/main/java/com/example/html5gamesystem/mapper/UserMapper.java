package com.example.html5gamesystem.mapper;

import com.example.html5gamesystem.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUsers();
    @Select("select password from user where name=#{name}")
    String getPassword(String name);
    @Select("select * from user where name=#{name}")
    int getUserByName(String name);
    @Insert("insert into user(name,password) values (#{name},#{password})")
    int addUser(String name,String password);
}





