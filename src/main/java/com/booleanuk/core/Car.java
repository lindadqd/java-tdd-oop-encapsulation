package com.booleanuk.core;

public class Car {
    private String color;
    private Battery battery;
    private String remoteControlType;

    public Car(String color, Battery battery, String remoteControlType){
        this.color = color;
        this.battery = battery;
        this.remoteControlType = remoteControlType;
    }

    public int getBatteryPercentage(){
        return battery.getBatteryPercentage();
    }

    public String moveForward(int distance){
        return "Car moved " + distance + " metres forward.";
    }

    public String moveBackward(int distance){
        return "Car moved " + distance + " metres backward.";
    }

    public String stopCar(){
        return "Car stopped";
    }

    public String turnLeft(){
        return "Car turned left";
    }

    public String turnRight(){
        return "Car turned right";
    }

    public String replaceBattery(Battery battery2){
        this.battery = battery2;
        return "Battery replaced";
    }

    public void chargeBattery(int percentage){
        battery.rechargeBattery(percentage);
    }

    public String getColor(){
        return color;
    }

    public String getRemoteControlType(){
        return remoteControlType;
    }

    public String getBatteryType(){
        return battery.getType();
    }


}
