package homework3.shop_ex1;
/**
 * Покупатель
 */
public class Customer {
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    void checkShop(Shop shop) {
        if ((shop.isClearFloor&&shop.workersHasBadge) || (shop.isClearFloor&&(shop.countWorkers>2))
                ||(shop.workersHasBadge&&(shop.countWorkers>2)))    {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}