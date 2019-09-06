package com.biniam.flight.Domain;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String userId;

    private User() {
    }

    private User(Builder builder) {
        this.username = Objects.requireNonNull(builder.userName, "user name");
        this.password = Objects.requireNonNull(builder.password, "user password");
        this.userId = Objects.requireNonNull(builder.userId, "userId");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userId='" + userId + '\'' +
                '}'+'\n';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String userName;
        private String password;
        private String userId;

        public Builder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
