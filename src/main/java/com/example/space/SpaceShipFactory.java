package com.example.space;

import javax.inject.Singleton;

@Singleton
public class SpaceShipFactory {

    public SpaceShip ship(){
        return  SpaceShip.builder().model("Pyramid")
                .captain("SlaveZero")
                .fuel(99)
                .build();
    }
}
