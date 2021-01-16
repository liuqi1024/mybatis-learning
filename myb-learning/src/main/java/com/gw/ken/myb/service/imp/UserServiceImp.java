package com.gw.ken.myb.service.imp;

import com.gw.ken.myb.dao.UserMapper;
import com.gw.ken.myb.model.User;
import com.gw.ken.myb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
  @Autowired
  UserMapper userMapper;

  @Override
  public int addUser(User user) {
    return userMapper.insertUser(user);
  }

  @Override
  public User findUserById(int id) {
    return userMapper.getUserById(id);
  }
}
