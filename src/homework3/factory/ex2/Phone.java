package homework3.factory.ex2;

public abstract class Phone {
    public Body body;
    public Camera camera;
    public Cpu cpu;

    public Phone(Body body, Camera camera, Cpu cpu) {
        this.body = body;
        this.camera = camera;
        this.cpu = cpu;
    }

}
