package aula06;

public class Ex16_1 {

	public static void main(String[] args) {
		
		Aluno al = new Aluno ("Andreia Melo", 9855678, new Data(18, 7, 1990), new Data (1, 9, 2018));
		Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985));
		bls.setMontante(1050);
		System.out.println("Aluno: " + al.getNome()); 
		System.out.println(al);
		System.out.println("Bolseiro: " + bls.getNome() + ", nmec: " + bls.getNmec() + ", Bolsa: " + bls.getMontante());
		System.out.println(bls);
	}

}
