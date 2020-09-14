package com.tse;

public class Main {

    public static void main(String[] args) {

        Car car = new AudiA5(40,"WAZZZURIRIRTHTHTT");
        car.start();
        car.shiftGear(1);
        System.out.println("Available fuel: " + car.getAvailableFuel());
        System.out.println("Count shifts: " + car.getCountShifts());
        car.drive(2);
        car.shiftGear(2);
        System.out.println("Count shifts: " + car.getCountShifts());
        car.drive(3);
        System.out.println("Consumption between stops: " + car.getAverageConsumptionBetweenStops());
        System.out.println("Available fuel: " + car.getAvailableFuel());


        Car car2 = new AudiA2(35, "WAZZUZUZUSASAS");
        car2.start();
        car2.shiftGear(1);
        car2.drive(10);
        System.out.println(car2.getAvailableFuel());


        Vehicle car3 = new AudiA2(35, "WAZZURIRIRSJDNADKA");
        car3.start();
        car3.drive(5);
        Car carC = (Car) car3;
        carC.start();
        carC.shiftGear(1);
        carC.drive(3);
        carC.stop();



        Car carPolo = new VwPolo(40, "WAZAZACACCSDJCSSDADA");
        carPolo.start();
        carPolo.shiftGear(1);
        carPolo.drive(0.5);
        carPolo.shiftGear(2);
        carPolo.drive(0.8);
        System.out.println(carPolo.getAvailableFuel());
        System.out.println(carPolo.getAverageConsumptionBetweenStops());
        carPolo.stop();
        carPolo.start();
        System.out.println(carPolo.getAverageConsumptionBetweenStops());








    }
}
