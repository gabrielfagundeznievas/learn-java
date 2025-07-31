package com.gabo.learnjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("hello")
    public String sayHello() {
        return "¡Hola Mundo desde Spring Boot!";
    }

    @GetMapping("greet/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hola " + name + ", ¡bienvenido!";
    }
    
    @GetMapping("formal-greet")
    public String formalGreet(@RequestParam(name = "name", required = false) String name) {
        if (name == null || name.isBlank()) {
            return "Estimados/as, reciban un cordial saludo.";
        }
        return "Estimada " + name + ", reciba un cordial saludo.";
    }
}
