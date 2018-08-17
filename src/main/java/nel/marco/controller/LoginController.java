package nel.marco.controller;

import nel.marco.validator.ValidateLoginDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final ValidateLoginDetails validateLoginDetails;

    @Autowired
    public LoginController(ValidateLoginDetails validateLoginDetails) {
        this.validateLoginDetails = validateLoginDetails;
    }

    @RequestMapping(name = "login", value = "/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {

        boolean usernameExist = validateLoginDetails.isUsernameValid(username);
        boolean passwordExist = validateLoginDetails.isPasswordValid(password);

        if (usernameExist && passwordExist) {
            return "login success";
        } else {
            return "Wrong username or password";
        }

    }
}
