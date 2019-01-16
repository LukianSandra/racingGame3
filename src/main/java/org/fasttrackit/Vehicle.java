package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumberOfVehicles;



    private String name;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public static int getApplicationTotalNumberOfVehicles() {
        return applicationTotalNumberOfVehicles;
    }

    public static void setApplicationTotalNumberOfVehicles(int applicationTotalNumberOfVehicles) {
        Vehicle.applicationTotalNumberOfVehicles = applicationTotalNumberOfVehicles;
    }

    private String color;
    private int wheelCount;
    private double mileage;
    private long totalKm;
    private double fuelLevel = 70 ;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }

    public double accelerate(double speed, double durationInHours) {
//semnatura metodei

        System.out.println(name + "accelerated with" + speed +
                "km/h for" + durationInHours + "minutes");
double distance = speed * durationInHours;
        System.out.println("Travel distance" + distance);

        double spentFuel = distance * mileage/100;

      // same as: fuelLevel = fuelLevel - spentFuel;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel" + fuelLevel);

        totalKm += distance;
        System.out.println("Total Traveled distance" + totalKm);

        return distance;

    }
    //method overloading

    public double accelerate (double speed){
        double distance = speed*1;
        return distance;

    }
public  double accelerate (double speed){
         return accelerate (speed, 1);

}
public String getName () {
        return name;
}
//method used to just demonstrate co-variant return types
    public Vehicle returnSomeVehicle(){
return this;

}

    public double getFuelLevel() {
        return fuelLevel;
    }
