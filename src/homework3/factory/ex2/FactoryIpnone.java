package homework3.factory.ex2;

public class FactoryIpnone {
    //public static Iphone iphone;

    public static Iphone product() {
        return new Iphone(new Body(200, 60, 10), new Camera(8),
              new Cpu(1000), new Cpu(1000));
    }

}
