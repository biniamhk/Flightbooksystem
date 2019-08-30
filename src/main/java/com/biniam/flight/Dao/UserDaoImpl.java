package com.biniam.flight.Dao;

import com.biniam.flight.Domain.User;

import java.util.*;

public class UserDaoImpl implements UserDao {
    Map<String, User> users = new HashMap<>();

    @Override
    public void createUser(User user) {
        if (users.containsKey(user.getUserId())) {
            throw new RuntimeException("user already exist");
        }
        users.put(user.getUserId(), user);


    }

    @Override
    public Optional<User> read(String userId) {
        return Optional.ofNullable(users.get(userId));
    }

    public Collection<User> readAllUser() {
        return users.values();
    }
}
