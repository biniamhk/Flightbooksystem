package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.UserDao;
import com.biniam.flight.Dao.UserDaoImpl;
import com.biniam.flight.Domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Collection;


public class UserDaoIntegrationTest {
    public GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("DaoTier.xml");
    public UserDao userDao = applicationContext.getBean(UserDao.class);

    @Test
    public void testCreatingUser() {

        userDao.createUser(User.builder().withUserId("1111").withUserName("biniam").withPassword("biniam123").build());
        Assert.assertNotNull(userDao.read("1111"));
    }

    @Test
    public void testReadingAllUsers() {

        userDao.createUser(User.builder().withUserId("11").withUserName("eden").withPassword("11").build());
        userDao.createUser(User.builder().withUserId("12").withUserName("noah").withPassword("12").build());
        userDao.createUser(User.builder().withUserId("13").withUserName("mary").withPassword("13").build());
        Assert.assertEquals(3, userDao.readAllUser().size());
        Collection<User> users = userDao.readAllUser();
        System.out.println(users);

    }
}
