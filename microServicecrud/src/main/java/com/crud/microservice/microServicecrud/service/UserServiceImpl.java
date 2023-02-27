package com.crud.microservice.microServicecrud.service;

import com.crud.microservice.microServicecrud.dto.UserDto;
import com.crud.microservice.microServicecrud.entity.UserDetailsCrud;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDto dto;

    @Override
    public List<UserDetailsCrud> getALlUser() {
        log.info("getAllUser() -> | ");
        List<UserDetailsCrud> allUser = dto.getAllUser();
        log.info("getAllUser() -> | All User : {}",allUser);
        return allUser;
    }

    @Override
    public UserDetailsCrud getUserById(String id) {
        log.info("getUserById(String) -> | Id : {}",id);
        UserDetailsCrud userById = dto.getUserById(id);
        log.info("getUserById(String) -> | User : {}",userById);
        return userById;
    }

    @Override
    public UserDetailsCrud createUser(UserDetailsCrud user) {
        log.info("createUser(User) -> | User : {}",user);
        UserDetailsCrud user1 = dto.createUser(user);
        log.info("createUser(User) -> | User : {}",user1);
        return user1;
    }

    @Override
    public List<UserDetailsCrud> createListUser(List<UserDetailsCrud> list) {
        log.info("createListUser(List<User>) -> | List User : {}",list);
        List<UserDetailsCrud> listUser = dto.createListUser(list);
        log.info("createListUser(List<User>) -> | List User : {}",listUser);
        return listUser;
    }

    @Override
    public UserDetailsCrud updateUser(String id, UserDetailsCrud user) {
        log.info("updateUser(User) -> | User : {}",user);
        UserDetailsCrud user1 = dto.updateUser(id,user);
        log.info("updateUser(User) -> | User : {}",user1);
        return user1;
    }

    @Override
    public String deleteUserById(String id) {
        log.info("deleteUserById(String) -> | Id : {}",id);
        String s = dto.deleteUserById(id);
        log.info("deleteUserById(String) -> | Message : {}",s);
        return s;
    }

    @Override
    public String deleteAll() {
        log.info("deleteAll() -> | ");
        String s = dto.deleteAll();
        log.warn("deleteAll() -> | Message : {}",s);
        return s;
    }
}
