package OverloadedConstructors;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String toopings;

     Pizza(String bread, String sauce, String cheese, String toopings) {
         this.bread = bread;
         this.sauce =sauce;
         this.cheese = cheese;
         this.toopings = toopings;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce =sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce =sauce;
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(){

    }
}
