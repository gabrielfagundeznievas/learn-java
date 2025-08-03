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
    public String greet(@PathVariable() String name) {
        return "Hola %s, ¡bienvenido!".formatted(name);
    }
    
    @GetMapping("formal-greet")
    public String formalGreet(@RequestParam(required = false) String name) {
        boolean hasName = name != null && !name.isBlank();

        return hasName
                ? "Estimada %s, reciba un cordial saludo.".formatted(name)
                : "Estimados/as, reciban un cordial saludo.";
    }
}
