package com.tse;

public class VwPolo extends Volkswagen {
    String chassisNumber;
    public VwPolo(double availableFuel, String chassisNumber) {
        super("VwPolo", 42, "Petrol", 5, 4.2, availableFuel, 16);
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
    public double getConsumptionPer100Km() {
        return super.getConsumptionPer100Km() - ((10/100) * getAvailableFuel() * getCountShifts());
        //this car has a 10% decrease every time it shifts up.
    }
}

