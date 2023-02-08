package EntenVerhalten.Enten;

import EntenVerhalten.Flug.FlugVerhalten;
import EntenVerhalten.Quack.QuackVerhalten;

public abstract class Ente {
    public FlugVerhalten flugVerhalten;
    public QuackVerhalten quackVerhalten;
    public abstract void schwimmen();
    public abstract void anzeigen();
    public void tuFliegen(){
        flugVerhalten.fliegen();
    }
    public void tuQuacken(){
        quackVerhalten.quacken();
    }
    public void setFlugVerhalten(FlugVerhalten f){
        flugVerhalten = f;
    }
    public void setQuackVerhalten(QuackVerhalten q){
        quackVerhalten = q;
    }
}
