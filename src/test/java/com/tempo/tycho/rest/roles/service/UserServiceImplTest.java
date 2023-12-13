package com.tempo.tycho.rest.roles.service;

import com.tempo.tycho.core.models.User;
import com.tempo.tycho.persistence.entity.UserEntity;
import com.tempo.tycho.persistence.repository.UserRepository;
import com.tempo.tycho.rest.user.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl sut;

    @Mock
    UserRepository repository;

    @Test
    public void getAllUsersShouldReturnAllUsers() {
        // Assemble
        List<UserEntity> roles = Arrays.asList(
                createUserEntity(1L, "Yaw", null, "Appiah", LocalDate.of(1999, 1, 1)),
                createUserEntity(2L, "Matthew", "B", "Jimu", LocalDate.of(2001, 04, 23)),
                createUserEntity(2L, "Linda", "Akua", "Frimpong", LocalDate.of(2000, 9, 7))
        );

        doReturn(roles)
                .when(repository)
                .findAll();

        // Act
        List<User> actual = sut.getAllUsers();

        // Assert
        assertThat(actual.size()).isEqualTo(roles.size());
    }

    private UserEntity createUserEntity(Long id, String firstName, String middleName, String lastName, LocalDate dob) {
        var userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setFirstName(firstName);
        userEntity.setMiddleName(middleName);
        userEntity.setLastName(lastName);
        userEntity.setDob(dob);
        return userEntity;
    }

}
