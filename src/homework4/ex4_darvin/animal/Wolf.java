package homework4.ex4_darvin.animal;

import homework4.ex4_darvin.animal_abstract.AbstractPredator;
import homework4.ex4_darvin.animal_interface.Predator;

public class Wolf extends AbstractPredator implements Predator {

    public Wolf(boolean isDead, float weight) {
        super(isDead, weight);
        super.maxVictimFloat = weight;
    }
}
