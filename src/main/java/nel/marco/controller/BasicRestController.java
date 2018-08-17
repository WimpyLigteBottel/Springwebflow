package nel.marco.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @RequestMapping(name = "hellowWorld", value = "/hello")
    public String helloWorld() {
        return "hello world!";
    }

    @RequestMapping(name = "repeat", value = "/repeat")
    public String repeat(@RequestParam(name = "text") String text) {
        return "I am saying the following: " + text;
    }

    @RequestMapping(name = "searchViaPathParam", value = "/repeat/{number}")
    public String searchViaPathParam(@PathVariable(value = "number") int number) {
        return "the following was in the pathParam: " + number;
    }


}
