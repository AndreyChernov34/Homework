package homework3.pyramid_ex3;

public class Pyramid1 extends Pyramid2  {
    @Override
    public void print(){
    System.out.println(text.substring(2,text.length())+text.substring(1,text.length())+text);
    }
}
