package office;

public class Boss {
    public String name;

    public Boss(String name) {
        this.name = name;
    }

    public void say(String nameManager) {
        System.out.println(nameManager + " быстрее!");
    }
}
