package com.example.mvvmtestnew;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel  {

    Repository repository;

    public MainViewModel() {
       repository = new Repository();
    }



    MutableLiveData<List<User>> mutableLiveData = new MutableLiveData<>();

//    //getter
//    public MutableLiveData<List<User>> getMutableUsers() {
//        return mutableUsers;
//    }




//    public void setMutableUsers() {
//
//        // request server
//
//        List<User> userList = new ArrayList<>();
//        userList.add(new User("ali","rezai"));
//        userList.add(new User("hssan","moradi"));
//        userList.add(new User("milad","nabi"));
//
//        mutableUsers.setValue(userList);  // set data in MutableLiveData
//    }



    public LiveData<List<User>> getUsers() {

//        if(mutableLiveData==null){
//            mutableLiveData = repository.requestUsers();
//        }
        mutableLiveData = repository.requestUsers();
        return mutableLiveData;
    }
}
