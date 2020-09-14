package com.tse;

public abstract class Car implements Vehicle {
    private final String name;
    private final int fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final double consumptionPer100Km;

    private double availableFuel;
    private int tireSize;
    private boolean isStarted = false;
    private int currentGear;
    private double averageConsumptionBetweenStops;
    private int countShifts;

    public Car(String name, int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, double availableFuel, int tireSize) {
        this.name = name;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
    }

    @Override
    public void start() {
        if(!isStarted){
            System.out.println(getName() + "->> Starts");
            averageConsumptionBetweenStops = 0;
            isStarted = true;
            averageConsumptionBetweenStops += 15/100 * availableFuel; //car consumption when you start the engine.
        } else {
            System.out.println("Already started");
        }


    }

    @Override
    public void drive(double km) {
        if(isStarted && (currentGear > 0 && currentGear <= gears)){
            System.out.println(getName() + " is driving " + km + " km.");
            averageConsumptionBetweenStops += (consumptionPer100Km * km) / 100; // get the fuel consumed for this km driven
        } else {
            System.out.println("Start or shift on a valid gear.");
        }


    }

    @Override
    public void stop() {
        if(isStarted){
            System.out.println(getName() + "->> Stops");
            isStarted = false;
        } else {
            System.out.println("Already stopped");
        }
    }



    public void shiftGear(int gear){
        if(isStarted && (gear > 0 && gear <= gears)){
            switch (gear){
                case 1:
                    System.out.println("gear -> 1");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;
                    break;
                case 2:
                    System.out.println("gear -> 2");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;

                    break;
                case 3:
                    System.out.println("gear -> 3");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;
                    break;
                case 4:
                    System.out.println("gear -> 4");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;
                    break;
                case 5:
                    System.out.println("gear -> 5");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;
                    break;
                case 6:
                    System.out.println("gear -> 6");
                    if(gear > currentGear){
                        countShifts += 1;
                    }
                    currentGear = gear;
                    break;
            }
        } else {
            System.out.println("Start the car or select a valid gear");
        }

    }

    public int getGears() {
        return gears;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public double getAvailableFuel() {
        return availableFuel - averageConsumptionBetweenStops;
    }


    public int getTireSize() {
        return tireSize;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public double getAverageConsumptionBetweenStops() {
        if(tireSize > 17){
            return averageConsumptionBetweenStops + 10/100 * availableFuel;
        }
        return averageConsumptionBetweenStops;
    }

    public int getCountShifts() {
        return countShifts;
    }

    public String getName() {
        return name;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public String getFuelType() {
        return fuelType;
    }
}
