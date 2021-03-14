package ObjectPassing;

public class Main {
    public static void main(String[] args){
        Garage garage = new Garage();

        Car car =  new Car("Tesla");
        Car car1 = new Car("BMW");
        Car car2 = new Car("Wolkswagen");
        Car car3 = new Car("Toyota");

        garage.Park(car);
        garage.Park(car1);
        garage.Park(car2);
        garage.Park(car3);

        garage.Drive(car);

    }
}
