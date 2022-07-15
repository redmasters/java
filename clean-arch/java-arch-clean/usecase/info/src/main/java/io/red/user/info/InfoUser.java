package io.red.user.info;

import io.red.user.model.User;
import io.red.user.model.UserNameList;

import java.util.ArrayList;
import java.util.List;

public class InfoUser {
    static public class UserData {
        public String name;
    }

    public static UserNameList obter(){
        List<User> userList = new ArrayList<>();
        final var user = new User("Name");
        userList.add(user);
        return new UserNameList(userList);
    }
}
