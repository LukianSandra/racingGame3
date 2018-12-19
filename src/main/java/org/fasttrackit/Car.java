package org.fasttrackit;

public class Car<Autovehicle> extends Autovehicle {

    //instance variables (declared as properties of a class)
    //they receive default values (null for objects, 0 for numbers,false for booleans)
    String name;
    String color;
    int  doorCount;

    public Car (Engine engine){
        super (engine)
    }
    double mileage;

    boolean running;
    long totalkm;
 Engine engine;

}
