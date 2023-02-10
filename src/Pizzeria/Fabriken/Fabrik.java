package Pizzeria.Fabriken;

import Pizzeria.Pizza.Pizza;

public abstract class Fabrik {
    public abstract Pizza erstellePizza(String typ, Fabrik fabrik);
    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}
