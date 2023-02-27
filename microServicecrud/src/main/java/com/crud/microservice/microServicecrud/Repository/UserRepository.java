package com.crud.microservice.microServicecrud.Repository;

import com.crud.microservice.microServicecrud.entity.UserDetailsCrud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetailsCrud, String> {

}
