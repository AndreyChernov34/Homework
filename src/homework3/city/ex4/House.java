package homework3.city.ex4;

public class House {
    private String Street;
    private int numberHouse;
    public House(String street, int numberHouse) {
        this.Street = street;
        this.numberHouse = numberHouse;
    }
    @Override
    public String toString () {
        return "House{" +
                "Название улицы'" + Street + '\'' +
                ", Номер дома=" + numberHouse +
                '}';
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String nameStreet) {
               this.Street = nameStreet;
    }
    public int getNumberHouse() {
        return this.numberHouse;
    }
    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
}
