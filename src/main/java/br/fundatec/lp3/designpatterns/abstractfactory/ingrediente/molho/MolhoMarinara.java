package br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Molho;

public class MolhoMarinara implements Molho {

	@Override
	public String description() {
		return "Molho marinada";
	}

}
