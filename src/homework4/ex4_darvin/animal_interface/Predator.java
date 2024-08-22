package homework4.ex4_darvin.animal_interface;

import homework4.ex4_darvin.animal_abstract.AbstractAlive;
import homework4.ex4_darvin.exception.AliveException;

public interface Predator {
    void attack(AbstractAlive alive) throws AliveException;
}
