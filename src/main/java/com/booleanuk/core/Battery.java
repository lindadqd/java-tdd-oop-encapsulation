package com.booleanuk.core;

import java.util.Objects;

public class Battery {
    private String type;
    private int percentage;

    public Battery(String type) {
       this.type = type.toUpperCase();
        this.percentage = 100;
    }

    public int getBatteryPercentage() {
        return percentage;
    }

    public String getType() {
        return "Battery type: " + type;
    }


    public void rechargeBattery(int percent) {
        if (Objects.equals(this.type, "RECHARGABLE")) {
            this.percentage += percent;
            System.out.println("Battery charged. New battery percentage: " + percentage + "%");
        } else System.out.println("The battery is of type disposable. Unable to charge.");
    }

}
