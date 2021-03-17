package accessModifiers.Package1;
import accessModifiers.Package2.*;

public class A {


//    protected String protectedMessage = "This is protected";
    public static void main(String[] args){
        Asub asub = new Asub();
//        System.out.println(asub.protectedMessage);

        C c = new C();
//        System.out.println(c.publicMessage);

        B b = new B();
//        System.out.println(b.privateMessage);

    }
}
