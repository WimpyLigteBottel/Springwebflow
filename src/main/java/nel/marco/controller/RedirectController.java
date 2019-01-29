package nel.marco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class RedirectController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void redirect(HttpServletResponse response) throws IOException {
        System.out.println("HELLO WORLD!");
        response.sendRedirect("/helloWorldFlow");
    }
}
