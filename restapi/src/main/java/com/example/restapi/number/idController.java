package com.example.restapi.number;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class idController {

    @GetMapping("/id")
    public DataResponse generateId() {
        return new DataResponse("XXX1");
    }
}
