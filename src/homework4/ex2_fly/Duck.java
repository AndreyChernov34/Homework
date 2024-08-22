package homework4.ex2_fly;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void fly() throws FlyException {
        if (isInjured == true) {
            throw new FlyException("утка ранена");
        } else {
            System.out.println("утка летит ");
        }
    }
}
