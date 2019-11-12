package br.fundatec.lp3.designpatterns.abstractfactory.pizzaria;

import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactory;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactoryPOA;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.Pizza;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.PizzaDeQueijo;

public class PizzariaPOA extends Pizzaria {

	private IngredienteFactory ingredienteFactory;

	public PizzariaPOA() {
		ingredienteFactory = new IngredienteFactoryPOA();
	}

	@Override
	protected Pizza criarPizza(String sabor) {

		Pizza pizza;

		switch(sabor) {
			case "queijo":
				pizza = new PizzaDeQueijo(ingredienteFactory);
				pizza.setName("Pizza De Queijo da franquia de POA");
				return pizza;
			default:
				return null;
		}

	}

}
