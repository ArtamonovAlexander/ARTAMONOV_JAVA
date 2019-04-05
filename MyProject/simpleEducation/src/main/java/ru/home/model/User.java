package ru.home.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String password_hash;
    private String login;
}
