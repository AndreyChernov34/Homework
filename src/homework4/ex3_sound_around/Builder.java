package homework4.ex3_sound_around;

public class Builder extends Human {
    @Override
    public void makeSound() {
        System.out.print("Я строитель. ");
        super.makeSound();
    }
}
