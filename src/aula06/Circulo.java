package aula06;

public class Circulo extends Figura {
	
	private Ponto center;
	private double raio;
	
	public Circulo(String cor, Ponto center, double raio) {
		super(cor);
		this.center = center;
		this.raio = raio;
	}


	public Ponto getCenter() {
		return center;
	}

	public void setCenter(Ponto center) {
		this.center = center;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.pow(this.raio,2)*Math.PI;
	}
	
	public double getPerimetro() {
		return Math.PI * 2* raio;
	}
	
	public static boolean intersect(Circulo a, Circulo b) {
		double d = Math.sqrt(Math.pow(a.getCenter().getX() - b.getCenter().getX(), 2) + Math.pow(a.getCenter().getY() - b.getCenter().getY(), 2));
		return (d<(a.getRaio()+b.getRaio()));
	}
	
	public String toString() {
		return "Centro em " + center + " e um raio de " + raio + " unidades de medida, area de " + getArea() + " unidades de area"
				+ "perimetro de " + getPerimetro();
	}
}
