package br.fundatec.lp3.designpatterns.abstractfactory.pizzastore;

import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.FactoryIngrediente;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.FactoryIngredientePOA;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.Pizza;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.PizzaDeQueijo;

public class PizzariaPOA extends Pizzaria {

	private FactoryIngrediente factoryIngrediente;

	public PizzariaPOA() {
		factoryIngrediente = new FactoryIngredientePOA();
	}

	@Override
	protected Pizza criarPizza(String sabor) {

		Pizza pizza;

		switch(sabor) {
			case "queijo":
				pizza = new PizzaDeQueijo(factoryIngrediente);
				pizza.setName("Pizza De Queijo da franquia de POA");
				return pizza;
			default:
				return null;
		}

	}

}
