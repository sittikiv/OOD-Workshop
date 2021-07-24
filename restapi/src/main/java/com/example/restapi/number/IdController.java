package com.example.restapi.number;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/id")
    public DataResponse generateId() {
        return new DataResponse("XYZ7");
    }

}