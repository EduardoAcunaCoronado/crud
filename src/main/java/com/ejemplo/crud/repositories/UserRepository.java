package com.ejemplo.crud.repositories;

import com.ejemplo.crud.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
