package com.crud.microservice.microServicecrud.service;

import com.crud.microservice.microServicecrud.entity.UserDetailsCrud;

import java.util.List;

public interface UserService {

    List<UserDetailsCrud> getALlUser();

    UserDetailsCrud getUserById(String id);

    UserDetailsCrud createUser(UserDetailsCrud user);

    List<UserDetailsCrud> createListUser(List<UserDetailsCrud> list);

    UserDetailsCrud updateUser(String id, UserDetailsCrud user);

    String deleteUserById(String id);

    String deleteAll();

}
