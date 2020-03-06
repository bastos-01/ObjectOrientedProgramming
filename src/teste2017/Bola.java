package teste2017;

public class Bola extends ObjetoMovel{
	
	private CorDaBola cor;
	private static int nBolas;

	public Bola(int x, int y, CorDaBola cor) {
		super(x, y);
		this.cor = cor;
		nBolas++;
	}
	
	public Bola(CorDaBola cor) {
		super(0,0);
		this.cor = cor;
		nBolas++;
	}

	public CorDaBola getCor() {
		return cor;
	}

	public void setCor(CorDaBola cor) {
		this.cor = cor;
	}

	
	public static int getnBolas() {
		return nBolas;
	}
	
	
	
}
