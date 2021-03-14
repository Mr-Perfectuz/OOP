package ObjectPassing;

public class Garage {

    void Park(Car car){
        System.out.println("The "+ car.name+" is parked in the garage ");
    }

    void Drive(Car car){
        System.out.println("You drive "+ car.name);
    }
}
