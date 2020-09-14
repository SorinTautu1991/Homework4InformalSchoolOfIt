package com.tse;

public abstract class Audi extends Car{
    public Audi(String name, int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, double availableFuel, int tireSize) {
        super(name, fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize);
    }
}
