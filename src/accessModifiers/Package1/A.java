package accessModifiers.Package1;
import accessModifiers.Package2.*;

public class A {
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.defaultmessage);

    }
}
