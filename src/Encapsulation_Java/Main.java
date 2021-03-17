package Encapsulation_Java;

public class Main {
    public static void main(String[] args){

//        encapsulation  = attributes of a class will be hidden or private
//                         Can be accessed only through methods(getters & setters)
//                         You should make attributes private if you don't have a reason to make them public/protected


        Car car = new Car("Chevrolet", "Captiva", 2020);

        car.setModel("Cybertruck");
        car.setMake("Tesla");
        car.setYear(2021);

        System.out.println(car.getModel() + " is made by "+ car.getMake() +" and produced in "+ car.getYear());





    }

}
