package com.tse;

public class AudiA5 extends Audi {
    private String chassisNumber;

    public AudiA5(double availableFuel, String chassisNumber) {
        super("AudiA5", 60, "Diesel", 6, 7.2, availableFuel, 19);
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void drive(double km) {
        super.drive(km);
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void shiftGear(int gear) {
        super.shiftGear(gear);
    }

    @Override
    public double getAverageConsumptionBetweenStops() {
        return super.getAverageConsumptionBetweenStops(); //the condition for the tireSize is in the Car class to be more generic.
    }
}


