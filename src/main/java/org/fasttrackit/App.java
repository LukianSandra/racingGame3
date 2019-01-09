package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        AutoVehicle autoVehicle = new AutoVehicle(engine);

        new Car();

        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(99.9, durationInHours: 0.5);

        System.out.println("Vehicle distance" + vehicle.getName() +"distance" );
        // declaring a variable and instantiating a Car object
        //this is aso called initializing a variable
       Car firstCompetitor  = new Car(new Engine ());
       firstCompetitor.setName = "Dacia";
       firstCompetitor.setColor = "black";
       firstCompetitor.doorCount =5;
       firstCompetitor.setMileage = 9.5;

       //local variables are variables declared inside a method
        //they don't receive default values

////       Engine firstEngine = new Engine();
//       firstEngine.manufacturer = "Renault";
//
//       //sout prints a message to the console
//
//        System.out.println(firstEngine.manufacturer);
//       firstCompetitor.engine = firstEngine;
//        firstCompetitor.engine.manufacturer = "BMW";
//
//
//
//        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstCompetitor.engine.manufacturer);
//
//firstCompetitor.accelerate(speed100,duration30);
//        System.out.println("Traveled distance"+ TraveledDistance);
//
              Vehicle vehicle =new Vehicle();
              vehicle.applicationTotalNumberOfVehicles= 1;
        System.out.println("Total from vehicle 1:"+ vehicle.applicationTotalNumberOfVehicles);

        Vehicle vehicle =new Vehicle();
        vehicle.applicationTotalNumberOfVehicles= 2;
        System.out.println("Total from vehicle 2:"+vehicle.applicationTotalNumberOfVehicles);



    }
}

