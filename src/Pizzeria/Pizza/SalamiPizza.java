package Pizzeria.Pizza;

import Pizzeria.Fabriken.Fabrik;

public class SalamiPizza extends Pizza{
    Fabrik fabrik;
    public SalamiPizza(Fabrik fabrik){
        this.fabrik = fabrik;
    }
    @Override
    public String toString(){
        return "Ich bin eine Salami Pizza aus der " + fabrik.toString();
    }
}
