package homework3.city.ex4;
import java.util.Arrays;

public final class City {
    private final House[] houses;
    private final String nameCity;
    public City(House[] houses, String nameCity) {
        this.houses = houses;
        this.nameCity = nameCity;
    }

    @Override
   public String toString() {
        return "City{" + nameCity + '\'' + Arrays.toString(houses) +'}';
    }

   public  House[] getHouses()    {
        House[] house2 =new House[houses.length];
        for (int i=0; i < houses.length ;i++) {
        house2[i] =new House(houses[i].getStreet(),houses[i].getNumberHouse());
    }
         return house2;
    }
}
