package homework4.ex1_carwash.cars;

public class Car {
    private boolean cleanCar;
    private int hight;
    private int width;
    private int length;

    public Car(boolean clean, int hight, int width, int length) {
        cleanCar = clean;
        this.hight = hight;
        this.width = width;
        this.length = length;
    }

    public void setClean(boolean clean) {
        cleanCar = clean;
    }

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
