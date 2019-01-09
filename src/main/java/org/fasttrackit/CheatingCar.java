package org.fasttrackit;

public class CheatingCar extends Vehicle {

    public double accelerate(double speed, double durationInHours) {
//semnatura metodei

        System.out.println(getName() + "accelerated with" + speed +
                "km/h for" + durationInHours + "minutes");
        double distance = 2 * speed * durationInHours;
        System.out.println("Travel distance" + distance);

        return distance;
    }
    //public double accelerate (double speed, double durationInHours) {
    //double cheatingSpeed = 2 * speed;
    //return super.accelerate (cheatingSpeed, durationInHours);

    //co-variant return type
    @Override
    public  AutoVehicle returnSomeVehicle (){
        return new AutoVehicle();

    }
}
