package accessModifiers.Package2;
import accessModifiers.Package1.*;

public class Asub extends A {
    public static void main(String[] args){
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

        C c = new C();
//        System.out.println(c.publicMessage);

    }
}
