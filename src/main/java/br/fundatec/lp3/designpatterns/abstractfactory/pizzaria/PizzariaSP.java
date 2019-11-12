package br.fundatec.lp3.designpatterns.abstractfactory.pizzastore;

import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.FactoryIngrediente;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.FactoryIngredientePOA;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.Pizza;
import br.fundatec.lp3.designpatterns.abstractfactory.pizza.PizzaDeQueijo;

public class PizzariaSP extends Pizzaria {

	private FactoryIngrediente pizzaIngredientFactory;

	public PizzariaSP() {
		pizzaIngredientFactory = new FactoryIngredientePOA();
	}

	@Override
	public Pizza criarPizza(String sabor) {

		if(sabor == "queijo") {
			return new PizzaDeQueijo(pizzaIngredientFactory);
		}

		return null;
	}

}
