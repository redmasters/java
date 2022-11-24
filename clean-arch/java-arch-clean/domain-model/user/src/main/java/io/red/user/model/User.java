package io.red.user.model;

import java.io.Serializable;

public class User implements Serializable {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
