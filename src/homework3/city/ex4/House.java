package homework3.city.ex4;

public class House {
    private String street;
    private int numberHouse;

    public House(String street, int numberHouse) {
        this.street = street;
        this.numberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "Название улицы'" + street + '\'' +
                ", Номер дома=" + numberHouse +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String nameStreet) {
        this.street = nameStreet;
    }

    public int getNumberHouse() {
        return this.numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
}
