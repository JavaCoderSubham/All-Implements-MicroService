package com.crud.microservice.microServicecrud.dto;

import com.crud.microservice.microServicecrud.Repository.UserRepository;
import com.crud.microservice.microServicecrud.entity.UserDetailsCrud;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class UserDtoImpl implements UserDto{

    @Autowired
    private UserRepository repository;

    @Override
    public List<UserDetailsCrud> getAllUser() {
        log.info("getAllUser() -> | ");
        List<UserDetailsCrud> list = repository.findAll();
        log.info("getAllUser() -> | List User : {}",list);
        return list;
    }

    @Override
    public UserDetailsCrud getUserById(String id) {
        log.info("getUserById(String) -> | id : {}",id);
        UserDetailsCrud user = repository.findById(id).orElseThrow();
        log.info("getUserById(String) -> | User : {}",user);
        return user;
    }

    @Override
    public UserDetailsCrud createUser(UserDetailsCrud user) {
        log.info("createUser(User) -> | User : {}",user);
        UserDetailsCrud save = repository.save(user);
        log.info("createUser(User) -> | User : {}",save);
        return save;
    }

    @Override
    public List<UserDetailsCrud> createListUser(List<UserDetailsCrud> list) {
        log.info("createListUser(List<User>) -> | List User : {}",list);
        List<UserDetailsCrud> users = repository.saveAll(list);
        log.info("createListUser(List<User>) -> | List User : {}",users);
        return users;
    }

    @Override
    public UserDetailsCrud updateUser(String id, UserDetailsCrud user) {
        log.info("updateUser(String,User) -> | Id : {} | User : {}",id,user);
        UserDetailsCrud getUser = getUserById(id);
        log.info("updateUser(String,User) -> | Id Present | User : {}",getUser);
        getUser.setName(user.getName());
        getUser.setEmail(user.getEmail());
        getUser.setRollNo(user.getRollNo());

        log.info("updateUser(String,User) -> | Set User | User : {}",getUser);
        UserDetailsCrud save = repository.save(getUser);
        log.info("updateUser(String,User) -> | Saved | User : {}",getUser);
        return save;
    }

    @Override
    public String deleteUserById(String id) {
        log.info("deleteUserById(String) -> | Id : {}",id);
        repository.deleteById(id);
        log.info("deleteUserById(String) -> | Id : {}",id);
        return "ID : "+id+" | Deleted...";
    }

    @Override
    public String deleteAll() {
        repository.deleteAll();
        return "All Deleted...";
    }
}
