package Estudo;


public class Estudo {
	public static void main(String[] args) {
	
	int x1 = 3;
	int x2 = 3;
	calcular(x1, x2);
	
}


public static void calcular(int x1, int x2) {
	if(x1>x2) {System.out.println("maior numero é : " + x1);}
	else if(x2>x1) {System.out.println("maior numero é : " + x2);}
	else {System.out.println("maior numero é : " + "nenhum");}
}




}