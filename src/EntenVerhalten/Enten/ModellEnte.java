package EntenVerhalten.Enten;

import EntenVerhalten.Flug.FliegtRaketenGetrieben;
import EntenVerhalten.Quack.QuacktNicht;

public class ModellEnte extends Ente{
    public ModellEnte(){
        flugVerhalten = new FliegtRaketenGetrieben();
        quackVerhalten = new QuacktNicht();
    }
    @Override
    public void schwimmen() {
        System.out.println("Die Modellente schwimmt");
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Modellente ist aus Holz");
    }
}
