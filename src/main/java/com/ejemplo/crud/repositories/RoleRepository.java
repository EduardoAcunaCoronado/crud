package com.ejemplo.crud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.crud.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
    
}
