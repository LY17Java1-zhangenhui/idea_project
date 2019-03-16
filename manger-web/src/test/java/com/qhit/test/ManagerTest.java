package com.qhit.test;

import com.qhit.mappr.UserMappr;
import com.qhit.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 2304802030@qq.com
 * @create 2019-03-16-12:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring-core.xml")
public class ManagerTest {
    @Autowired
    private UserMappr mappr;

    @Test
    public void login() {
        User user = new User();
        user.setName("admin");
        user.setPassWord("123");
        User user1 = mappr.login(user);
        if (user1 != null) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
    }

}
