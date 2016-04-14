package com.shurrik.demo.service;

import com.shurrik.demo.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lip on 2016-04-14.
 */
public class UserServiceTest {

    @Test
    public void testFindAll()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application-context.xml");
        IUserService userService = (IUserService) ctx.getBean("UserServiceImpl");
        List<User> users = userService.findAll();
        for(User user:users)
        {
            System.out.println(user.getUserName());
        }
    }
}
