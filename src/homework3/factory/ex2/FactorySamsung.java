package homework3.factory.ex2;

public class FactorySamsung {

    public static Samsung product() {
        return new Samsung(new Body(200, 60, 15), new Camera(16), new Cpu(1600));
    }
}
