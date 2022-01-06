package com.example.prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class Registry
{
    private Map<VehicleType,Vehicle> list;

    public Registry()
    {
        initVehicles();
    }
    public Vehicle getVehicle(VehicleType type)
    {
        try
        {
            return (Vehicle) list.get(type).clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private void initVehicles()
    {
        list = new HashMap<>();

        Bus bus = new Bus();
        bus.setBrand("Ashok Leyland");
        bus.setModel("Viking");
        bus.setCapacity(2500);

        Car car = new Car();
        car.setBrand("Tesla");
        car.setModel("Model X");
        car.setCapacity(1300);

        Van van = new Van();
        van.setBrand("Toyota");
        van.setModel("KDH");
        van.setCapacity(2000);

        list.put(VehicleType.BUS,bus);
        list.put(VehicleType.CAR,car);
        list.put(VehicleType.VAN,van);

    }
}
