package ru.home.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Encoder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserForm {
    private String login;
    private String password;
    private Encoder encoder;
}
