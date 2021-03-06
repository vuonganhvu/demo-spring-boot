package com.itss.demo.service;

import com.itss.demo.entity.User;
import com.itss.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Optional<User> findOne(Integer id) {
        return usersRepository.findById(id);
    }
}
