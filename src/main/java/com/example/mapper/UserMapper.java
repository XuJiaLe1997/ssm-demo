package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 插入用户信息
     *
     * @param user 用户信息
     * @return 数据库受影响的行数，插入成功就是返回1
     */
    @Insert("insert into user(name,password,age) values(#{name},#{password},#{age})")
    int insert(User user);

    /**
     * 根据姓名查询用户信息查询
     *
     * @param id 用户id
     * @return 返回数据库查询结果集
     */
    @Select("select * from user where id=#{id}")
    User select(@Param("id") long id);
}
