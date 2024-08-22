
package homework4.ex4_darvin.animal;

import homework4.ex4_darvin.animal_abstract.AbstractPredator;
import homework4.ex4_darvin.animal_interface.Predator;


public class Tiger extends AbstractPredator implements Predator {

    public Tiger(boolean isDead, int weight) {
        super(isDead, weight);
        super.maxVictimFloat = weight * 2;
    }
}
