package model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String first_name;
    private String last_name;
    private String password_hash;
    private String login;
}
