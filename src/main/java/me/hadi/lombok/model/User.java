package me.hadi.lombok.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}