package br.fundatec.lp3.designpatterns.abstractfactory.ingredientefactory;

import java.util.List;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.massa.Massa;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.molho.Molho;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.queijo.Queijo;
import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.tempero.Tempero;

public interface IngredienteFactory {

	public Massa prepararMassa();
	public Molho prepararMolho();
	public Queijo prepararQueijo();
	public List<Tempero> prepararTempero();

}
