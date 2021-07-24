package com.example.restapi.number;

import com.example.restapi.GenerateIdService;
import com.example.restapi.user.UserGateway;
import com.example.restapi.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @Autowired
    private GenerateIdService service;

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/id")
    public DataResponse generateId() {
        String result = service.getId();
        return new DataResponse(result);
    }

    @GetMapping("/user")
    public UserResponse getUser() {
        UserResponse user = userGateway.getUserById(1);
        return user;
    }

}
