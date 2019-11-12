package br.fundatec.lp3.designpatterns.abstractfactory.pizzaria;

import br.fundatec.lp3.designpatterns.abstractfactory.pizza.Pizza;

public abstract class Pizzaria {
		
	public final Pizza pedirPizza(String sabor) {
		
		Pizza pizza = criarPizza(sabor);
		
		pizza.preparar();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza criarPizza(String type);
	
}
