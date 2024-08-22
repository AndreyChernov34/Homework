package homework4.ex1_carwash;

import homework4.ex1_carwash.cars.Car;

public class CarWash {
    private static int HIGHT_AUTO = 2500;
    private static int LENGTH_AUTO = 6000;
    private static int WIDTH_AUTO = 2000;
    private static int LIGHTCAR_PRICE = 2000;
    private static int BUS_PRICE = 4000;

    public void doWashCars(Car[] cars) {
        int price = 0;
        for (Car car : cars) {
            car.setClean(true);
            price += priceCar(car);
        }
        System.out.println("Машины помыты. Стоимость мойки =" + price);
    }

    public void doWashCar(Car car) {
        car.setClean(true);
        System.out.println("Машина помыта. Стоимость мойки =" + priceCar(car));
    }

    private int priceCar(Car car) {
        boolean overSize = false;
        if (car.getHight() > HIGHT_AUTO) {
            overSize = true;
        }
        if (car.getLength() > LENGTH_AUTO) {
            overSize = true;
        }
        if (car.getWidth() > WIDTH_AUTO) {
            overSize = true;
        }
        if (overSize) {
            return (BUS_PRICE);
        } else {
            return (LIGHTCAR_PRICE);
        }
    }
}
