package ArrayOfObjects;

public class Main {
    public static void main(String[] args){

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Cake");
        Food food3 = new Food("Chocolate");

        System.out.println(refrigerator[1]);


    }
}
