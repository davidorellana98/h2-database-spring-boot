package com.davidorellana.h2databasewithspringboot.repository;

import com.davidorellana.h2databasewithspringboot.model.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Long> { }
