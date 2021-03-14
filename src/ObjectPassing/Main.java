package ObjectPassing;

public class Main {
    public static void main(String[] args){
        Garage garage = new Garage();

        Car car =  new Car("Tesla");
        Car car1 = new Car("BMW");

        garage.Park(car);
        garage.Park(car1);

    }
}
