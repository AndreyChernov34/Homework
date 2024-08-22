package homework3.factory.ex2;

public class Iphone extends Phone {
    public Cpu cpu2;

    public Iphone(Body body, Camera camera, Cpu cpu, Cpu cpu2) {
        super(body, camera, cpu);
        this.cpu2 = cpu2;
    }

    public void infoCpu() {
        System.out.println("Частота процессора №1:" + cpu.mhz + "Mhz, Частота процессора №2:" + cpu2.mhz + "Mhz\n");
    }
}
