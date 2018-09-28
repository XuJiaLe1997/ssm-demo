/**
 * 单元测试
 */

package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testAdd(){
        //构建容器。对于服务器上的程序，bean交给web服务器来实例化，我们不需要管，但是本地测试我们需要手动创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);  //容器向userMapper注入实例
        User user = new User();
        user.setName("");
        user.setPassword("");
        user.setAge(0);
        System.out.println(userMapper.insert(user));
    }

    @Test
    public void testGet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user =userMapper.select(1);
        System.out.println(user);
    }

}
