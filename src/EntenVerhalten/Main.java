package EntenVerhalten;

import EntenVerhalten.Enten.*;
import EntenVerhalten.Flug.*;
import EntenVerhalten.Quack.*;
public class Main {
    public static void main(String[] args) {
        ModellEnte modellEnte = new ModellEnte();
        modellEnte.tuFliegen();
        modellEnte.tuQuacken();
    }
}