package com.biniam.flight.Dao;

import com.biniam.flight.Domain.User;

import java.util.Collection;
import java.util.Optional;

public interface UserDao {
    void createUser(User user);

    Optional<User> read(String userId);

    public Collection<User> readAllUser();

}
