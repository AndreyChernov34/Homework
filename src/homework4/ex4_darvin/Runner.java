package homework4.ex4_darvin;

import homework4.ex4_darvin.animal.Elephant;
import homework4.ex4_darvin.animal.Rabbit;
import homework4.ex4_darvin.animal.Tiger;
import homework4.ex4_darvin.animal.Wolf;
import homework4.ex4_darvin.exception.AliveException;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(false, 300);
        Wolf wolf = new Wolf(false, 50);
        Rabbit rabbit = new Rabbit(false, 2);
        Elephant elephant = new Elephant(false, 2000);

        try {
            rabbit.canRun();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            wolf.attack(rabbit);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attack(wolf);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attack(elephant);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            elephant.canRun();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            rabbit.canRun();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }
    }
}
