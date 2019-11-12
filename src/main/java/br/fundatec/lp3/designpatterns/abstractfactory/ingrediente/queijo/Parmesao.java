package br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.impl;

import br.fundatec.lp3.designpatterns.abstractfactory.ingrediente.Queijo;

public class QueijoReggiano implements Queijo {

	@Override
	public String description() {
		return "Queijo Reggiano";
	}
}
