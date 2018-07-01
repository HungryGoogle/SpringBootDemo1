package com.example.mysqldemo1.dao;


import com.example.mysqldemo1.model.UserDomain;

import java.util.List;

public interface UserDao {
    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}