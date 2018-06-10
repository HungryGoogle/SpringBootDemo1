package com.deepin.demo.web.login.dao;

import com.deepin.demo.web.login.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/5/12.
 */
//@Repository
public interface UserDao extends CrudRepository<UserEntity,Long>{

//    public UserEntity findByUsernameAndPassword(String username, String password);

}
