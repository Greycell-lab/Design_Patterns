package EntenVerhalten.Enten;

import EntenVerhalten.Flug.FliegtGarNicht;
import EntenVerhalten.Quack.Quietschen;

public class GummiEnte extends Ente{
    public GummiEnte(){
        quackVerhalten = new Quietschen();
        flugVerhalten = new FliegtGarNicht();
    }
    @Override
    public void schwimmen() {
        System.out.println("Die Gummiente schwimmt");
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Gummiente");
    }
}
