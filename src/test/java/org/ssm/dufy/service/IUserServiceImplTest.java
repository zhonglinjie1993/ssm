package org.ssm.dufy.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.dufy.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:applicationContext.xml"})
public class IUserServiceImplTest {
    @Autowired
    public IUserService userService;

    @Test
    public void getUserByIdTest() {

        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }
}