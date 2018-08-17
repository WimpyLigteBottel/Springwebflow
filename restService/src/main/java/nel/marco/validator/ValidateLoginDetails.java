package nel.marco.validator;

import org.springframework.stereotype.Component;

@Component
public class ValidateLoginDetails {

    public boolean isUsernameValid(String username) {
        return username.equals("admin");
    }


    public boolean isPasswordValid(String password) {
        return password.equals("admin");
    }
}
