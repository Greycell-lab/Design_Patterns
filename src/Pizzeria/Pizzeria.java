package Pizzeria;

import Pizzeria.Fabriken.Fabrik;
import Pizzeria.Pizza.Pizza;

public class Pizzeria {
    Fabrik fabrik;

    public Pizzeria(Fabrik fabrik) {
        this.fabrik = fabrik;
    }
    public Pizza bestellePizza(String typ){
        Pizza pizza = fabrik.erstellePizza(typ, fabrik);
        return pizza;
    }
}
