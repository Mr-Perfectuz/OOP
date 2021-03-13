package OverloadedConstructors;

public class Main {
    public  static void main(String[] args){

        Pizza pizza = new Pizza("thic cross", "tomato", "mozerolla", "pepperone");
        Pizza Amerianpizza = new Pizza("thic cross", "tomato", "mozerolla");
        Pizza Europeanpizza = new Pizza("thic cross", "tomato");
        Pizza Asianpizza = new Pizza("thic cross");
        Pizza UzbekPizza = new Pizza();

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toopings);

        System.out.println();

    }
}
