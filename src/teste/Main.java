package teste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(2,3);
		Alvo c2 = new Alvo(4,5,"veremelho");
		System.out.println(c1);
		c1=c2;
		System.out.println(c1);
		Circulo c3 = new Alvo(4,5,"veremelho");
		System.out.println(c3);
		System.out.println("1234" + 99);
		
	}

}