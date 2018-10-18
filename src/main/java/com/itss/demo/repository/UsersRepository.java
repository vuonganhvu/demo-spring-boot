package com.itss.demo.repository;

import com.itss.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUserName(String username);
}
