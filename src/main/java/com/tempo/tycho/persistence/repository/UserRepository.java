package com.tempo.tycho.persistence.repository;

import com.tempo.tycho.persistence.entity.UserEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>,
        QuerydslPredicateExecutor<UserEntity> {
}
