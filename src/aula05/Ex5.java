package aula05;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, x2, y1, y2, novo_x1, novo_y1;
		double raio1, raio2;
		double comprimento, altura;
		double lado1, lado2, lado3;
		
		//Ponto
		
		
		System.out.println("Insira o x do ponto1: ");
		x1 = input.nextDouble();
		
		System.out.println("Insira o y do ponto1: ");
		y1 = input.nextDouble();
		
		System.out.println("Insira o x do ponto2: ");
		x2 = input.nextDouble();
		
		System.out.println("Insira o y do ponto2: ");
		y2 = input.nextDouble();
		
		Ponto ponto1 = new Ponto(x1,y1);
		Ponto ponto2 = new Ponto(x2,y2);
		
		System.out.println("x do ponto1: " + ponto1.getX());
		System.out.println("y do ponto1: " + ponto1.getY());
		System.out.println("x do segundo ponto: " + ponto2.getX());
		System.out.println("y do segundo ponto: " + ponto2.getY());
		
		System.out.println("Introduza o novo x para o ponto1");
		novo_x1 = input.nextDouble();
		ponto1.setX(novo_x1);
		
		System.out.println("Introduza o novo y para o ponto1");
		novo_y1 = input.nextDouble();
		ponto1.setY(novo_y1);
		
		System.out.printf("Novas coordenadas do ponto1: x = " + ponto1.getX() + "; y = " + ponto1.getY());
		
		//Circulo
		
		System.out.println("Introduza o raio do primeiro círculo");
		raio1 = input.nextDouble();
		
		System.out.println("Introduza o raio do segundo círculo");
		raio2 = input.nextDouble();
		
		Circulo circulo1 = new Circulo(ponto1, raio1);
		Circulo circulo2 = new Circulo(ponto2, raio2);
		
		System.out.println("Área do círculo 1: " + circulo1.getArea());
		System.out.println("Perímetro do círculo 1: " + circulo1.getPerimetro());
		
		System.out.println("Àrea do círculo 2: " + circulo2.getArea());
		System.out.println("Perímetro do círculo 2: " + circulo2.getPerimetro());
		
		//Retangulo
		
		System.out.println("Introduza o comprimento do retângulo");
		comprimento = input.nextDouble();
		
		System.out.println("Introduza a altura do retângulo");
		altura = input.nextDouble();
		
		Retangulo retangulo = new Retangulo(comprimento,altura);
		
		System.out.println("Área do retângulo: " + retangulo.getArea());
		System.out.println("Perímetro do retângulo: " + retangulo.getPerimetro());
		
		//Triangulo
		
		System.out.println("Introduza o lado 1 do triângulo");
		lado1 = input.nextDouble();
		
		System.out.println("Introduza o lado 2 do triângulo");
		lado2 = input.nextDouble();
		
		System.out.println("Introduza o lado 3 do triângulo");
		lado3 = input.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
		
		System.out.println("Perímetro do triângulo: " + triangulo.getPerimetro());
		
		System.out.println("Área do triângulo: " + triangulo.getArea());
		
		
		input.close();

	}

}
