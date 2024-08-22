package homework4.ex1_carwash.cars;

public class LightCar extends Car {
    boolean cruise;

    public LightCar(boolean clean, int hight, int width, int length, boolean cruise) {
        super(clean, hight, width, length);
        this.cruise = cruise;
    }
}
