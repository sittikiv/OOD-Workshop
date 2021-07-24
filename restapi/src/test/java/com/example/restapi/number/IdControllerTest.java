package com.example.restapi.number;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IdControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void generateId() {
        // Act
        DataResponse result
                = restTemplate.getForObject("/id", DataResponse.class);
        // Assert
        assertEquals("XYZ7", result.getId());
    }
}