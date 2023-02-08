package EntenVerhalten.Quack;

public class Quietschen implements QuackVerhalten{
    @Override
    public void quacken() {
        System.out.println("Die Ente Quietscht");
    }
}
