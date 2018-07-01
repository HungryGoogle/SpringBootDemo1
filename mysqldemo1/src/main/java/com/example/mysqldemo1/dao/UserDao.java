package com.example.mysqldemo1.dao;


import com.example.mysqldemo1.model.UserDomain;

import java.util.List;

public interface UserDao {
    int insert(UserDomain record);

    List<UserDomain> selectUsers();

    UserDomain selectUser(int userId);
    int update(UserDomain record);
    int delete(int userId);
}