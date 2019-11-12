package br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Pepperoni;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Vegetais;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.Alho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.Cebola;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.Champignon;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.MassaFina;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.MolhoMarinara;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.PepperoniFatiado;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.PimentaVermelha;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl.QueijoReggiano;

public class FactoryIngredienteSP implements FactoryIngrediente {

	@Override
	public Massa prepararMassa() {
		return new MassaFina();
	}

	@Override
	public Molho prepararMolho() {
		return new MolhoMarinara();
	}

	@Override
	public Queijo prepararQueijo() {
		return new QueijoReggiano();
	}

	@Override
	public Vegetais[] prepararVegetais() {
		Vegetais[] vegetais = { new Alho(), new Cebola(), new Champignon(), new PimentaVermelha()  };
		return vegetais;
	}

	@Override
	public Pepperoni prepararPepperoni() {
		return new PepperoniFatiado();
	}

}
