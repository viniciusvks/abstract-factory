package br.fundatec.lp3.designpatterns.abstractfactory.pizza;

import java.util.List;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Tempero;
import br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory.IngredienteFactory;

public class PizzaDeQueijo extends Pizza {

	private IngredienteFactory ingredientFactory;
	private Massa massa;
	private Molho molho;
	private Queijo queijo;
	private List<Tempero> temperos;

	public PizzaDeQueijo(IngredienteFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void preparar() {
		System.out.println("Preparando "+nome);
		massa = ingredientFactory.prepararMassa();
		System.out.println("Adicionando "+massa.descricao());
		molho = ingredientFactory.prepararMolho();
		System.out.println("Adicionando "+molho.descricao());
		queijo = ingredientFactory.prepararQueijo();
		System.out.println("Adicionando "+queijo.description());
		
		temperos = ingredientFactory.prepararTempero();
		
		for(Tempero tempero : temperos) {
			System.out.println("Adicionando " + tempero.descricao());
		}
		
	}

}
