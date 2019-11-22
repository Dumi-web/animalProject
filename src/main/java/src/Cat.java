package src;

public class Cat extends animals {

      private static String name = "Stormy";

        Cat(){
            super(name);
        }

    public void sound(){
        System.out.println("Cat Meows");
    }
}
