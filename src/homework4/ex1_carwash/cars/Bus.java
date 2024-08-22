package homework4.ex1_carwash.cars;

public class Bus extends Car {
    int countPassenger;

    public Bus(boolean clean, int hight, int width, int length, int countPassenger) {
        super(clean, hight, width, length);
        this.countPassenger = countPassenger;
    }
}
