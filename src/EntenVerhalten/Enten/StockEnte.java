package EntenVerhalten.Enten;

import EntenVerhalten.Enten.Ente;
import EntenVerhalten.Flug.FliegtMitFlügeln;
import EntenVerhalten.Quack.Quacken;

public class StockEnte extends Ente {
    public StockEnte(){
        quackVerhalten = new Quacken();
        flugVerhalten = new FliegtMitFlügeln();
    }
    @Override
    public void schwimmen() {
        System.out.println("Die Stockente schwimmt");
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Stockente");
    }
}
