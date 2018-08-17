package nel.marco.controller;

import com.google.gson.Gson;
import nel.marco.controller.model.Response;
import nel.marco.controller.model.UserDetail;
import nel.marco.validator.ValidateLoginDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    private final ValidateLoginDetails validateLoginDetails;

    @Autowired
    public LoginController(ValidateLoginDetails validateLoginDetails) {
        this.validateLoginDetails = validateLoginDetails;
    }

    @RequestMapping(name = "login", value = "/login")
    public String loginMethod(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {

        boolean usernameExist = validateLoginDetails.isUsernameValid(username);
        boolean passwordExist = validateLoginDetails.isPasswordValid(password);

        if (usernameExist && passwordExist) {
            return "login success";
        } else {
            return "Wrong username or password";
        }

    }

    @RequestMapping(name = "login", value = "/loginUserDetails", method = RequestMethod.GET)
    public Response loginUserDetailsMethod(HttpEntity entity) {

        Gson gson = new Gson();


        UserDetail userDetails = gson.fromJson(entity.getHeaders().get("userdetail").get(0), UserDetail.class);

        Response response = new Response();

        String password = userDetails.getPassword();
        String username = userDetails.getUsername();

        response.setValidPassword(validateLoginDetails.isUsernameValid(username));
        response.setValidUsername(validateLoginDetails.isPasswordValid(password));


        if (response.isValidPassword() && response.isValidUsername()) {
            response.setMessage("SUCCESS");
        }else {
            response.setMessage("NO");
        }


        return response;

    }
}
