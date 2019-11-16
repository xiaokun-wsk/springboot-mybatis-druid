package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
     List<User> findAll();//查
     String insterUser(User user);//插
     String updateUser(User user);//改
     String deleteUser(Long Id);//删
}
