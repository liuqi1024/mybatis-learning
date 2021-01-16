package com.gw.ken.myb.controller;

import com.gw.ken.myb.model.User;
import com.gw.ken.myb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
  @Autowired
  UserService userService;

  @PostMapping("/addUser")
  @ResponseBody
  public String addUser(@RequestBody String name, @RequestBody String email) {
    User user = new User();
    user.setName(name);
    user.setEmail(email);
    int id = userService.addUser(user);
    return id + "...";
  }

  @GetMapping("/find/{id}")
  @ResponseBody
  public String findUser(@PathVariable("id") Integer id) {
    User user = userService.findUserById(id);
    System.out.println("id = " + user.getId());
    return user.toString();
  }
}
