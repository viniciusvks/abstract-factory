package br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory;

import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.MassaGrossa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.MolhoMarinara;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Mussarella;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Alho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.PimentaVermelha;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Tempero;

public class IngredienteFactorySP implements IngredienteFactory {

	@Override
	public Massa prepararMassa() {
		return new MassaGrossa();
	}

	@Override
	public Molho prepararMolho() {
		return new MolhoMarinara();
	}

	@Override
	public Queijo prepararQueijo() {
		return new Mussarella();
	}

	@Override
	public List<Tempero> prepararTempero() {
		List<Tempero> temperos =  new ArrayList<>();
		temperos.add(new Alho());
		temperos.add(new PimentaVermelha());
		return temperos;
	}

}
