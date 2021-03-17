package Inheritance_Java;

public class Vehicle {

    double speed;
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    void go(){
        System.out.println("This " + " is moving ");
    }
    void Stop(){
        System.out.println("This "+ "is stopped");
    }

}
