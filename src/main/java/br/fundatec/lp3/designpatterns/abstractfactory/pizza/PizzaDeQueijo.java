package br.fundatec.lp3.designpatterns.abstractfactory.pizza;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.FactoryIngrediente;

public class PizzaDeQueijo extends Pizza {

	private FactoryIngrediente ingredientFactory;
	private Massa massa;
	private Molho molho;
	private Queijo queijo;

	public PizzaDeQueijo(FactoryIngrediente ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void preparar() {
		System.out.println("Preparando "+nome);
		massa = ingredientFactory.prepararMassa();
		System.out.println("Adicionando "+massa.description());
		molho = ingredientFactory.prepararMolho();
		System.out.println("Adicionando "+molho.description());
		queijo = ingredientFactory.prepararQueijo();
		System.out.println("Adicionando "+queijo.description());
	}

}
