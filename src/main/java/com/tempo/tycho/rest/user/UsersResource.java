package com.tempo.tycho.rest.user;

import com.tempo.tycho.core.models.User;
import com.tempo.tycho.rest.user.model.UserBean;
import com.tempo.tycho.rest.user.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RestController
@RequestMapping("/users")
public class UsersResource {

    private final UserService userService;

    public UsersResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserBean> getAll() {
        return toResponse(userService.getAllUsers());
    }

    private List<UserBean> toResponse(List<User> users) {
        return users
                .stream()
                .map(r -> new UserBean(r.getId(), r.getFirstName(), r.getMiddleName(), r.getLastName(), r.getDob()))
                .collect(Collectors.toList());
    }

}
