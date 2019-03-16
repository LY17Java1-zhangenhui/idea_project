package com.qhit.mappr;

import com.qhit.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 2304802030@qq.com
 * @create 2019-03-16-12:03
 */
public interface UserMappr {
    @Insert("insert into admin(name,password) values (#{name},#{passWord}) ")
    int add(User user);

    @Select("select *from admin where name=#{name} and password=#{passWord}")
    User login(User user);

    @Select("select*from admin")
    List<User> findAll();
}
