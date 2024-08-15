package homework3.factory.ex2;

public class factorySamsung {
    public static Samsung samsung;
    public static Samsung Product(){
       return samsung = new Samsung(new Body(200,60,15), new Camera(16),new CPU(1600));
    }
}
