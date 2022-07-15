package io.red.user.model;

import java.util.List;

public class UserNameList {
    private List<User> userList;

    public UserNameList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
