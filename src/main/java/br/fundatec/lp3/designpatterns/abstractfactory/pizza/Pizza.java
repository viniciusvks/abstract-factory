package br.fundatec.lp3.designpatterns.abstractfactory.pizza;

public abstract class Pizza {

	protected String nome;

	public abstract void preparar();

	public void bake() {
		System.out.println("Cozinhando por 25 minutos a 350 graus");
	}

	public void cut() {
		System.out.println("Cortando a pizza em fatias diagonais");
	}

	public void box() {
		System.out.println("Embalando na caixa da pizzaria");
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getName() {
		return nome;
	}
}
