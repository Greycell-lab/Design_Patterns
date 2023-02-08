package EntenVerhalten.Quack;

public class QuacktNicht implements QuackVerhalten{
    @Override
    public void quacken() {
        System.out.println("Quackt nicht");
    }
}
