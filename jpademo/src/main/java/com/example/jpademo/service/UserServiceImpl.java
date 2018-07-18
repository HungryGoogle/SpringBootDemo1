package com.example.jpademo.service;

import java.util.List;
import java.util.Optional;

import com.example.jpademo.bean.User;
import com.example.jpademo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserRepository userJpaRepository;
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
    {
        return userJpaRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> findByName(String name)
    {
        List<User> userList1 = userRepository.findByName1(name);
        List<User> userList2 = userRepository.findByName2(name);
        List<User> userList3 = userRepository.findByNameAndAddress(name, "3");
        System.out.println("userList1:" + userList1);
        System.out.println("userList2:" + userList2);
        System.out.println("userList3:" + userList3);
        return userRepository.findByName(name);
    }

    public int addUser(User user)
    {
        userJpaRepository.save(user);
        return 0;
    }

    @Cacheable("users")
    public Optional<User> findOne(long id)
    {
        System.out.println("Cached Pages");
        return userJpaRepository.findById(id);
    }

    public void delete(long id)
    {
        userJpaRepository.deleteById(id);
//        userJpaRepository.delete(id);
        return;
    }

    public int update(User user)
    {
        return userRepository.updateValues(user.getName(), user.getAddress(), (int )user.getId());
    }
}