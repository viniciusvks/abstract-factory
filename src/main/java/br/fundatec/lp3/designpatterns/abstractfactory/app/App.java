package br.fundatec.lp3.designpatterns.abstractfactory.app;

import br.fundatec.lp3.designpatterns.abstractfactory.pizzaria.Pizzaria;
import br.fundatec.lp3.designpatterns.abstractfactory.pizzaria.PizzariaPOA;
import br.fundatec.lp3.designpatterns.abstractfactory.pizzaria.PizzariaSP;

public class App {
    public static void main( String[] args ) {
        Pizzaria pizzariaPoa = new PizzariaPOA();
        pizzariaPoa.pedirPizza("queijo");
        
        System.out.println();
        
        Pizzaria pizzariaSp = new PizzariaSP();
        pizzariaSp.pedirPizza("queijo");
    }
}
