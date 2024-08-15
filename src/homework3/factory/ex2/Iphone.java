package homework3.factory.ex2;

public class Iphone extends Phone {
    public CPU cpu2;
    public Iphone(Body body, Camera camera, CPU cpu, CPU cpu2) {
        super(body, camera, cpu);
        this.cpu2 = cpu2;
    }
    public void infoCPU(){
       System.out.println("Частота процессора №1:"+cpu.Mhz+"Mhz, Частота процессора №2:"+cpu2.Mhz+"Mhz\n");
    }
}
