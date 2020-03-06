package aula07;

public class ObjetoMovel {
	private double x;
	private double y;
	private double velMax;
	private double dist;
	
	public ObjetoMovel(double x, double y, double velMax, double dist) {
		this.x = x;
		this.y = y;
		this.velMax = velMax;
		this.dist = dist;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}

	@Override
	public String toString() {
		return "ObjetoMovel [x=" + x + ", y=" + y + ", velMax=" + velMax + ", dist=" + dist + "]";
	}
	
	public void move(int newX, int newY) {
		dist = dist + (Math.sqrt(Math.pow(this.y - newY,2 ) + Math.pow(this.x - newX,2 )));
		setX(newX);
		setY(newY);
	}
	
	
	
}
