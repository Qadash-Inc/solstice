package com.tempo.tycho.rest.user.service;

import com.tempo.tycho.core.models.User;
import com.tempo.tycho.persistence.entity.UserEntity;
import com.tempo.tycho.persistence.repository.UserRepository;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        return Lists.newArrayList(repository.findAll())
                .stream()
                .map(UserEntity::toDomain)
                .collect(Collectors.toList());
    }
}
