package homework4.ex3_sound_around;

import homework4.ex3_sound_around.abstract_classes.MakingSound;
import homework4.ex3_sound_around.abstract_classes.Speaking;

public class Human extends MakingSound implements Speaking {
    @Override
    public void makeSound() {
        System.out.println("Я человек");
    }
}
