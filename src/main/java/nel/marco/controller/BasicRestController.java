package nel.marco.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @RequestMapping(value = "/hello")
    public String helloWorldMethod() {
        return "hello world!";
    }

    @RequestMapping(value = "/repeat")
    public String repeatMethod(@RequestParam(name = "text") String text) {
        return "I am saying the following: " + text;
    }

    @RequestMapping(value = "/repeat/{number}")
    public String searchViaPathParamMethod(@PathVariable(value = "number") int number) {
        return "the following was in the pathParam: " + number;
    }


}
