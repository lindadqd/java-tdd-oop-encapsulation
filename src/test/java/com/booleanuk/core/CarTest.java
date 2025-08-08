package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void getBatteryPercentage(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals(100, car.getBatteryPercentage());
    }

    @Test
    public void moveForward(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Car moved 10 metres forward.", car.moveForward(10));
    }

    @Test
    public void moveBackward(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Car moved 10 metres backward.", car.moveBackward(10));
    }

    @Test
    public void stopCar(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Car stopped", car.stopCar());
    }

    @Test
    public void turnLeft(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Car turned left", car.turnLeft());
    }

    @Test
    public void turnRight(){
        Battery battery = new Battery("disposable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Car turned right", car.turnRight());
    }

    @Test
    public void replaceBattery(){
        Battery battery = new Battery("disposable");
        Battery battery2 = new Battery("rechargable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Battery replaced", car.replaceBattery(battery2));
    }

    @Test
    public void chargeBattery(){
        Battery battery = new Battery("rechargable");
        Car car = new Car("black", battery, "advanced");
        car.chargeBattery(50);
        Assertions.assertEquals(150, car.getBatteryPercentage());
    }

    @Test
    public void getColor(){
        Battery battery = new Battery("rechargable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("black", car.getColor());
    }

    @Test
    public void getRemoteControlType(){
        Battery battery = new Battery("rechargable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("advanced", car.getRemoteControlType());
    }

    @Test
    public void getBatteryType(){
        Battery battery = new Battery("rechargable");
        Car car = new Car("black", battery, "advanced");
        Assertions.assertEquals("Battery type: RECHARGABLE", car.getBatteryType());
    }
}
