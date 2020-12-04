package by.example.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final static String result = "Method executed";

    @RequestMapping("/controller")
    public String execute() {
        return result;
    }
}
