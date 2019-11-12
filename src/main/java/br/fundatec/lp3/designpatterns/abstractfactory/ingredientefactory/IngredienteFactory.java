package br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Pepperoni;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Vegetais;

public interface FactoryIngrediente {

	public Massa prepararMassa();
	public Molho prepararMolho();
	public Queijo prepararQueijo();
	public Vegetais[] prepararVegetais();
	public Pepperoni prepararPepperoni();

}
