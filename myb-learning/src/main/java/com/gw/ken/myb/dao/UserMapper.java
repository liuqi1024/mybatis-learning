package com.gw.ken.myb.dao;

import com.gw.ken.myb.model.User;

public interface UserMapper {
  User getUserById(int userId);
  int insertUser(User user);
}
