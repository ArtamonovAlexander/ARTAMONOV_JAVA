package ru.home.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Auth {
    private Long id;
    private String value;
    private User user;
}
