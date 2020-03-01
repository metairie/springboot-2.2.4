package net.metairie.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World from service");
        sb.append("\r");
        return sb.toString();
    }
}
