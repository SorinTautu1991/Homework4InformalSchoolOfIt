package com.tse;

public class VwPassat extends Volkswagen {
    private String chassisNumber;
    public VwPassat(double availableFuel, String chassisNumber) {
        super("VwPassat", 50, "Diesel", 6, 5.2, availableFuel, 18);
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
        return super.getAverageConsumptionBetweenStops() - ((10/100) * getAvailableFuel() * getCountShifts());
        //this car has a 10% decrease every time it shifts up.
    }
}
