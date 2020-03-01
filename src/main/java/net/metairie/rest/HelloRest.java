package net.metairie.rest;

import net.metairie.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloRest {

    @Autowired
    public HelloService helloService;

    @GetMapping
    public String Hello() {
        return "Rest Controller calls service, it replies: " + helloService.sayHello();
    }
}
