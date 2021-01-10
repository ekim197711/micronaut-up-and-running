package com.example;

import com.example.space.SpaceShip;
import com.example.space.SpaceShipFactory;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@Controller("/hello")
@RequiredArgsConstructor
public class MyController {

    private final SpaceShipFactory spaceShipFactory;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World TESTING 1234";
    }

    @Get(produces = MediaType.APPLICATION_JSON, uri = "/spaceship")
    public SpaceShip spaceship() {
        return spaceShipFactory.ship();
    }
}
