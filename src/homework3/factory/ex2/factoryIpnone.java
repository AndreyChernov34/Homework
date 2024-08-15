package homework3.factory.ex2;

public class factoryIpnone {
    public static Iphone iphone;
    public static Iphone Product(){
      return iphone = new Iphone(new Body(200,60,10), new Camera(8),
              new CPU(1000), new CPU(1000));
    }

}
