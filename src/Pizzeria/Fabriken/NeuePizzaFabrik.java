package Pizzeria.Fabriken;

import Pizzeria.Pizza.Pizza;
import Pizzeria.Pizza.SalamiPizza;

public class NeuePizzaFabrik extends Fabrik{
    @Override
    public Pizza erstellePizza(String typ, Fabrik fabrik) {
        if(typ.equals("Salami")) return new SalamiPizza(fabrik);
        return null;
    }
}
