package homework4.ex4_darvin.animal_abstract;

public abstract class AbstractAlive {
    private boolean isDead;
    private float weight;

    public AbstractAlive(boolean isDead, float weight) {
        this.isDead = isDead;
        this.weight = weight;
    }

    public void dye() {
        this.isDead = true;
    }

    public boolean isDead() {
        return isDead;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

