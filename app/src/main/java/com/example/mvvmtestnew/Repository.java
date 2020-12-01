package com.example.mvvmtestnew;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    MutableLiveData<List<User>> mutableLiveData = new MutableLiveData<>();

    public MutableLiveData<List<User>> requestUsers() {

        List<User> userList = new ArrayList<>();
        userList.add(new User("ali","rezai"));
        userList.add(new User("hssan","moradi"));
        userList.add(new User("milad","nabi"));

        mutableLiveData.setValue(userList);
        return mutableLiveData;
    }
}
