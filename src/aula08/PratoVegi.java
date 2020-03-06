package aula08;

public class PratoVegi extends Prato {

	public PratoVegi(String nome, DiaSemana diaSem) {
		super(nome, diaSem);
	}
	
	public PratoVegi(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return "Vegetariano Prato '" + getNome() + "', composto por " + getNIngredientes() + " ingredientes, dia " + getDiaSem();
	}

	
}
