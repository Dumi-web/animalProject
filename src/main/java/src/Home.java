package src;

import java.util.ArrayList;

    public class Home{

private ArrayList<animals> animal;

    public Home(){

     animal = new ArrayList<animals>();
}

    public void adoptPet(animals animal1){

        animal.add(animal1);
    }
    public void makeAllSounds(){

        for(animals b: animal){

            b.sound();
        }
        System.out.println();
    }
}