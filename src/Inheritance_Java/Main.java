package Inheritance_Java;

public class Main {
    public static void main(String[] args){
        //  inheritance = the process where one class acquires
//                the attributes and the method of another

        Car car = new Car("Tesla");
        car.go();

        Bicycle bicycle = new Bicycle("Kama");
        bicycle.Stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);
    }

}
