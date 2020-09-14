package com.tse;

public class AudiA2 extends Audi {
    private String chassisNumber;
    public AudiA2(double availableFuel, String chassisNumber) {
        super("AudiA2", 40, "Petrol", 5, 4.2, availableFuel, 17);
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
        return super.getAverageConsumptionBetweenStops() + 20/100 * getAvailableFuel();
        //this car is a Petrol car has higher fuel consumption.
    }
}
