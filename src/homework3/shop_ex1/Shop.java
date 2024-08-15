package homework3.shop_ex1;

/**
 * Магазин
 */
public class Shop {
    public boolean isClearFloor; //Чистый пол
    public boolean workersHasBadge; //Есть ли бейджики у сотрудников
    public int countWorkers; //Количество работников в магазине

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }
}