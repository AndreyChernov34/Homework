package homework3.pyramid_ex3;

public class Pyramid1 extends Pyramid2  {
    protected String text = super.text.substring(1, super.text.length()) + super.text;

    @Override
    public void print() {
        System.out.println('1' + text);
    }
}
