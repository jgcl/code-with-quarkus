package org.joaogabriel.resources;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringResource {

    @GetMapping(value = "/spring")
    public String olaSpring() {
        return "ola spring";
    }

}