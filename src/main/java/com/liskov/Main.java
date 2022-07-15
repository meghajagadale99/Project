package com.liskov;

import java.util.ArrayList;
import java.util.List;

public
class Main {
    public static
    void main(String[] args) {
        Vehicle first = new Car();
        Vehicle second = new RacingCar();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(first);
        vehicles.add(second);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInteriorWidth());
        }
    }
}
