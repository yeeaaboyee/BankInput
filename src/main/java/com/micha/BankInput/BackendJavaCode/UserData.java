package com.micha.BankInput.BackendJavaCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserData {
    ArrayList<User> users = new ArrayList<>();

    public UserData() {

    }
    public void addUsers(User user) {
        users.add(user);
    }
    public int getUserDataSize() {
        return users.size();
    }
    public User getUser(int i) {
        return users.get(i);
    }
}
