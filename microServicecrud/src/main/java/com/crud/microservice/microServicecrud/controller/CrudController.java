package com.crud.microservice.microServicecrud.controller;

import com.crud.microservice.microServicecrud.entity.UserDetailsCrud;
import com.crud.microservice.microServicecrud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/crud")
public class CrudController {

    @Autowired
    private UserService service;

    @GetMapping("/getAll")
    public List<UserDetailsCrud> getAllUser() {
        log.info("getAllUser() -> | ");
        List<UserDetailsCrud> allUser = service.getALlUser();
        log.info("getAllUser() -> | all User : {}",allUser);
        return allUser;
    }

    @GetMapping("/userid")
    public UserDetailsCrud getUserById(@RequestParam String id) {
        log.info("getUserById(String) -> | Id : {}",id);
        UserDetailsCrud userById = service.getUserById(id);
        log.info("getUserById(String) -> | User : {}",userById);
        return userById;
    }

    @PostMapping("/create")
    public UserDetailsCrud createUser(@RequestBody UserDetailsCrud user) {
        log.info("createUser(User) -> | User : {}",user);
        UserDetailsCrud user1 = service.createUser(user);
        log.info("createUser(User) -> | User : {}",user1);
        return user1;
    }

    @PostMapping("/createAll")
    public List<UserDetailsCrud> createListUser(@RequestBody List<UserDetailsCrud> list) {
        log.info("createListUser(List<User>) -> | List User : {}",list);
        List<UserDetailsCrud> listUser = service.createListUser(list);
        log.info("createListUser(List<User>) -> | List User : {}",listUser);
        return listUser;
    }

    @PutMapping("/update")
    public UserDetailsCrud updateUser(@RequestParam String id, @RequestBody UserDetailsCrud user) {
        log.info("updateUser(String,User) -> | Id : {} | User : {}",id,user);
        UserDetailsCrud user1 = service.updateUser(id, user);
        log.info("updateUser(String,User) -> | User : {}",user1);
        return user1;
    }

    @DeleteMapping("/userid")
    public String deleteUserById(@RequestParam String id) {
        log.info("deleteUserById(String) -> | Id : {}",id);
        String s = service.deleteUserById(id);
        log.info("deleteUserById(String) -> | Message : {}",s);
        return s;
    }

    @DeleteMapping("/deleteall")
    public String deleteAll() {
        log.info("deleteAll() -> | ");
        String s = service.deleteAll();
        log.info("deleteAll() -> | Message : {}",s);
        return s;
    }

}
