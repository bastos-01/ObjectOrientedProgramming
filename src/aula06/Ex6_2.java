package aula06;

import java.util.Scanner;

public class Ex6_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1,  y1;
		double raio1;
		double comprimento, altura;
		double lado1, lado2, lado3;
		
		//Ponto
		
		
		System.out.println("Insira o x do ponto1: ");
		x1 = input.nextDouble();
		
		System.out.println("Insira o y do ponto1: ");
		y1 = input.nextDouble();
		

		
		Ponto ponto1 = new Ponto(x1,y1);

		
		
		
		//Circulo
		
		System.out.println("Introduza o raio do primeiro círculo");
		raio1 = input.nextDouble();
		
		//Teste do atributo cor da classe Figura para o circulo
		Circulo circulo1 = new Circulo("azul", ponto1, raio1);
		
		System.out.println("Área do círculo 1: " + circulo1.getArea());
		System.out.println("Perímetro do círculo 1: " + circulo1.getPerimetro());
		System.out.println("Coro do círculo 1: " + circulo1.getCor());
		
		
		//Retangulo
		
		System.out.println("Introduza o comprimento do retângulo");
		comprimento = input.nextDouble();
		
		System.out.println("Introduza a altura do retângulo");
		altura = input.nextDouble();
		
		//Teste do atributo cor da classe Figura para o retangulo
		Retangulo retangulo = new Retangulo("Amarelo",comprimento,altura);
		
		System.out.println("Área do retângulo: " + retangulo.getArea());
		System.out.println("Perímetro do retângulo: " + retangulo.getPerimetro());
		System.out.println("Cor do retângulo: " + retangulo.getCor());
		
		//Triangulo
		
		System.out.println("Introduza o lado 1 do triângulo");
		lado1 = input.nextDouble();
		
		System.out.println("Introduza o lado 2 do triângulo");
		lado2 = input.nextDouble();
		
		System.out.println("Introduza o lado 3 do triângulo");
		lado3 = input.nextDouble();
		
		//Teste do atributo cor da classe Figura para o triangulo
		Triangulo triangulo = new Triangulo("Roxo",lado1,lado2,lado3);
		
		System.out.println("Perímetro do triângulo: " + triangulo.getPerimetro());
		
		System.out.println("Área do triângulo: " + triangulo.getArea());
		System.out.println("Cor do triângulo: " + triangulo.getCor());
		
		
		input.close();

	}
}
