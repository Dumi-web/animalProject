package src;

public class Dog extends animals{

     private static String name = "Rax";

        Dog(){
        super(name);
    }

    public void sound(){
        System.out.println("Dog Barks");
    }
}
