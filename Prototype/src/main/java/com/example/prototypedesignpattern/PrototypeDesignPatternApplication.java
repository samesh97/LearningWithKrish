package com.example.prototypedesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeDesignPatternApplication {

    public static void main(String[] args)
    {
        Registry registry = new Registry();

        Vehicle car = registry.getVehicle(VehicleType.CAR);
        Vehicle bus = registry.getVehicle(VehicleType.BUS);
        Vehicle van = registry.getVehicle(VehicleType.VAN);
    }

}
