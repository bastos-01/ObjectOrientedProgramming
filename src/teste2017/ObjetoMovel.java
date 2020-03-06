package teste2017;

public class ObjetoMovel {
	private int x;
	private int y;
	private int velocidade;
	private double distancia;
	
	public ObjetoMovel(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distanciaPercorrida) {
		this.distancia = distanciaPercorrida;
	}

	@Override
	public String toString() {
		return "ObjetoMovel [x=" + x + ", y=" + y + ", velocidade=" + velocidade + ", distanciaPercorrida="
				+ distancia + "]";
	}
	
	public void move(int newX, int newY) {
		distancia += Math.sqrt(Math.pow( this.x - newX, 2) + Math.pow(this.y - newY, 2));
		this.x = newX;
		this.y = newY;
	}
	
	public void move(int newX, int newY, int velocidade) {
		distancia += Math.sqrt(Math.pow( this.x - newX, 2) + Math.pow(this.y - newY, 2));
		this.x = newX;
		this.y = newY;
		this.velocidade = velocidade;
	}
	
}
