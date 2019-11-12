package br.fundatec.lp3.designpatterns.abstractfactory.pizzaria;

import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactory;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactoryPOA;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactorySP;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.Pizza;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.PizzaDeQueijo;

public class PizzariaSP extends Pizzaria {

	private IngredienteFactory factoryIngrediente;

	public PizzariaSP() {
		factoryIngrediente = new IngredienteFactorySP();
	}

	@Override
	public Pizza criarPizza(String sabor) {

		Pizza pizza;

		switch(sabor) {
			case "queijo":
				pizza = new PizzaDeQueijo(factoryIngrediente);
				pizza.setName("Pizza De Queijo da franquia de SP");
				return pizza;
			default:
				return null;
		}
	}

}
