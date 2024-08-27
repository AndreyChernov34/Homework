package homework5.ex2_worm;

public class Computer {
    protected String user = "";

    public void login(String user) {
        this.user = user;
    }

    public void exit() {
        this.user = "";
    }

    public void print(String string) {
        System.out.println("Сообщение: " + string);
    }

}
