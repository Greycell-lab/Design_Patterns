package Pizzeria;

import Pizzeria.Fabriken.EinfachePizzaFabrik;
import Pizzeria.Fabriken.NeuePizzaFabrik;
import Pizzeria.Pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizzeria(new EinfachePizzaFabrik()).bestellePizza("Salami");
        Pizza pizza1 = new Pizzeria(new NeuePizzaFabrik()).bestellePizza("Salami");
        System.out.println(pizza);
        System.out.println(pizza1);
    }
}
