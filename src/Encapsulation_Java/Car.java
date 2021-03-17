package Encapsulation_Java;

public class Car {
    private String make;
    private String model;
    private  int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

//     getters have been implemented

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
//     setters have been implemented


    public void setMake(){
        this.make = make;
    }
}
