package org.example.warehousev1be.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.warehousev1be.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
@Repository  //@用户数据层
public interface UserMapper {

    //用户数据表的查询
    @Select("SELECT #{username} FROM user_table")
    public List<User> queryUser(@RequestParam("username") User data);

    //
    @Insert("INSERT INTO user_table WHERE (#{id}, #{username}, #{password})")
    public List<User> addUser();
}
