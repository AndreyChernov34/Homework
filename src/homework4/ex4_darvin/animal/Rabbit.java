package homework4.ex4_darvin.animal;

import homework4.ex4_darvin.animal_abstract.AbstractAlive;
import homework4.ex4_darvin.animal_interface.Herbivore;
import homework4.ex4_darvin.exception.AliveException;

public class Rabbit extends AbstractAlive implements Herbivore {
    public Rabbit(boolean isDead, int weight) {
        super(isDead, weight);
    }

    @Override
    public void canRun() throws AliveException {
        if (this.isDead()) {
            throw new AliveException("животное не может бежать");
        } else {
            System.out.println("Кролик быстро бежит");
        }
    }
}
