package com.gw.ken.myb.service;

import com.gw.ken.myb.model.User;

public interface UserService {
  public int addUser(User user);

  public User findUserById(int id);
}
