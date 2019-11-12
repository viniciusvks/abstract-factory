package br.fundatec.lp3.designpatterns.abstractfactory.app;

import br.fundatec.lp3.designpatterns.abstractfactory.pizzastore.PizzariaPOA;

public class App {
    public static void main( String[] args ) {
        PizzariaPOA pizzaria = new PizzariaPOA();
        pizzaria.pedirPizza("queijo");
    }
}
