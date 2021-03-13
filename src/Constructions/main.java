package Constructions;

public class main {
    public static void main(String[] args){
        Human human = new Human("Jack", 21, 170.0);
        Human human2 = new Human("John", 31, 190.0);

        human.name = "Tony";
        human.age = 20;
        human.weight = 160.0;

        System.out.println(human.name);
    }
}
