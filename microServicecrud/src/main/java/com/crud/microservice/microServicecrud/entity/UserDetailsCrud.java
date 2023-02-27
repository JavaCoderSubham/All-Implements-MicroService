package com.crud.microservice.microServicecrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetailsCrud {

    @Id
    private String userId;
    private String name;
    @Column(unique = true)
    private String rollNo;
    @Column(unique = true)
    private String email;



}
