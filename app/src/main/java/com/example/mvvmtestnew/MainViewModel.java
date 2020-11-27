package com.example.mvvmtestnew;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    MutableLiveData<List<User>> mutableUsers = new MutableLiveData<>();

    //getter
    public MutableLiveData<List<User>> getMutableUsers() {
        return mutableUsers;
    }


    public void setMutableUsers() {

        // request server

        List<User> userList = new ArrayList<>();
        userList.add(new User("ali","rezai"));
        userList.add(new User("hssan","moradi"));
        userList.add(new User("milad","nabi"));

        mutableUsers.setValue(userList);  // set data in MutableLiveData
    }
}
