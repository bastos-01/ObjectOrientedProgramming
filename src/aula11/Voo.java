package aula11;

public class Voo {
		private String hora;
		private String voo;
		private String origem;
		private String atraso;
		private String companhia;
		private String obs;
		

	public Voo(String hora, String voo,String companhia, String origem, String atraso, String obs ) {
			this.hora = hora;
			this.voo = voo;
			this.origem = origem;
			this.atraso = atraso;
			this.companhia = companhia;
			this.obs = obs;
		}
	
	

	public Voo(String hora, String voo, String companhia, String origem ) {
		this.hora = hora;
		this.voo = voo;
		this.origem = origem;
		this.companhia = companhia;
		this.atraso = "";
		this.obs = "";
	}
	
	


	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	@Override
	public String toString() {
		return hora + "\t" + voo + "\t" + companhia + "\t" + origem + "\t" + atraso + "\t" + obs ;
	}



	public String getCompanhia() {
		return companhia;
	}



	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}



	public String getObs() {
		return obs;
	}



	public void setObs(String obs) {
		this.obs = obs;
	}
	

}
