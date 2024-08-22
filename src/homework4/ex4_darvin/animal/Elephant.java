package homework4.ex4_darvin.animal;

import homework4.ex4_darvin.animal_abstract.AbstractAlive;
import homework4.ex4_darvin.animal_interface.Herbivore;
import homework4.ex4_darvin.exception.AliveException;

public class Elephant extends AbstractAlive implements Herbivore {
    public Elephant(boolean isDead, int weight) {
        super(isDead, weight);
    }

    @Override
    public void canRun() throws AliveException {
        if (this.isDead()) {
            throw new AliveException("животное не может бежать");
        } else {
            System.out.println("Слон медленно бежит");
        }
    }
}
