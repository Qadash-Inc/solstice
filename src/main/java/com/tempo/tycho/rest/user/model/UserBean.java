package com.tempo.tycho.rest.user.model;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UserBean {
    Long id;
    String firstName;
    String middleName;
    String lastName;
    LocalDate dob;
}
