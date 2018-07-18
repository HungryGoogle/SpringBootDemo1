package com.example.jpademo.service;

import java.util.List;
import java.util.Optional;

import com.example.jpademo.bean.User;

public interface IUserService
{
    public List<User> findAll();

    public void saveUser(User book);
   
    public Optional<User> findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);

}