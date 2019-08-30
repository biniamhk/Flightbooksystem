package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.UserDao;
import com.biniam.flight.Dao.UserDaoImpl;
import com.biniam.flight.Domain.User;
import org.junit.Assert;
import org.junit.Test;


public class UserDaoUnitTest {

    @Test
    public void testCreatingUser() {
        UserDao userDao = new UserDaoImpl();
        userDao.createUser(User.builder().withUserId("1111").withUserName("biniam").withPassword("biniam123").build());
        Assert.assertNotNull(userDao.read("1111"));
    }

    @Test
    public void testReadingAllUsers() {
        UserDao userDao = new UserDaoImpl();
        userDao.createUser(User.builder().withUserId("11").withUserName("eden").withPassword("11").build());
        userDao.createUser(User.builder().withUserId("12").withUserName("noah").withPassword("12").build());
        userDao.createUser(User.builder().withUserId("13").withUserName("mary").withPassword("13").build());
        Assert.assertEquals(3, userDao.readAllUser().size());

    }
}
