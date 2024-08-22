package homework4.ex4_darvin.animal_abstract;

import homework4.ex4_darvin.animal_interface.Predator;
import homework4.ex4_darvin.exception.AliveException;

public class AbstractPredator extends AbstractAlive implements Predator {
    //максимальный вес жертвы
    protected float maxVictimFloat = this.getWeight();

    public AbstractPredator(boolean isDead, float weight) {
        super(isDead, weight);
    }

    @Override
    public void attack(AbstractAlive alive) throws AliveException {
        if (this.isDead()) {
            throw new AliveException("животное не может нападать");
        }

        if (maxVictimFloat < alive.getWeight()) {
            this.dye();
        } else {
            alive.dye();
            this.setWeight(this.getWeight() + (alive.getWeight() / 3));
        }
    }
}
