package accessModifiers.Package2;
import accessModifiers.Package1.*;

public class Asub extends A {
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.defaultmessage);

    }
}
