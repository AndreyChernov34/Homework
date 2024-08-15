package homework3.factory.ex2;

public class Camera{
    public int MegaPixel;
    public Camera(int megaPixel) {
        MegaPixel = megaPixel;
    }
    public void makePhoto(){
        System.out.println("сделано фото\n");
    }
}
