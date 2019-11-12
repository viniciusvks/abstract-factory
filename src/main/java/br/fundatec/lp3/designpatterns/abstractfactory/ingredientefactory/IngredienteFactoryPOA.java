package br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory;

import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.MassaFina;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.MolhoMarinara;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.MolhoTomate;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Parmesao;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Cebolinha;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Manjericao;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Tempero;

public class IngredienteFactoryPOA implements IngredienteFactory {

	@Override
	public Massa prepararMassa() {
		return new MassaFina();
	}

	@Override
	public Molho prepararMolho() {
		return new MolhoTomate();
	}

	@Override
	public Queijo prepararQueijo() {
		return new Parmesao();
	}

	@Override
	public List<Tempero> prepararTempero() {
		List<Tempero> temperos =  new ArrayList<>();
		temperos.add(new Cebolinha());
		temperos.add(new Manjericao());
		return temperos;
	}

}
