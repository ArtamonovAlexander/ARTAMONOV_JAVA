package form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.User;
import repositiory.UserRepository;

import java.beans.Encoder;
import java.security.spec.EncodedKeySpec;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserForm {
    private String login;
    private String password;
    private Encoder encoder;
}
