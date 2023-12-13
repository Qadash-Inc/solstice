package com.tempo.tycho.core.models;

import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    Long id;
    String firstName;
    String middleName;
    String lastName;
    LocalDate dob;
}
