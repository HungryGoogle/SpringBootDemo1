package com.example.mysqldemo1.user;

import com.example.mysqldemo1.model.UserDomain;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);
    int updateUser(UserDomain user);
    int deleteUser(int userId);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
    UserDomain findUserByUserId(int userId);
}
