package edu.iu.habahram.pizzashop.model;

public class NewYorkStore {
    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new NewYorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}