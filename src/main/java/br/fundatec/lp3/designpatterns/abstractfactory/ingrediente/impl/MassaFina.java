package br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Massa;

public class MassaFina implements Massa {

	@Override
	public String description() {
		return "Massa fina e crocante";
	}

}
