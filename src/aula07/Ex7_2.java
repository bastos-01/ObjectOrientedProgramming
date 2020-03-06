package aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_2 {
    
    static Scanner sc;
    static AgenciaViagens agencia;
    
    public static void main(String[] args){
        agencia = new AgenciaViagens("Viajar", "Aveiro");
        Apartamento ap1 = new Apartamento("36587", "Apartamento1", "Aveiro", 80.5, 4.0, 2);
        Apartamento ap2 = new Apartamento("12863", "Apartamento2", "Agueda", 105.3, 4.1, 2);
        QuartoHotel q1 = new QuartoHotel("58732", "HotelCr7", "Lisboa", 500.0, 5.0, "double");
        Carro carro1 = new Carro("65302" ,"A", "diesel");
        Carro carro2 = new Carro("65398", "B", "gasolina");
        
        agencia.addAlojamento(ap1); 
        agencia.addAlojamento(ap2); 
        agencia.addAlojamento(q1);
        agencia.addCarro(carro1);
        agencia.addCarro(carro2);
        
        sc = new Scanner(System.in);
        menu();
        sc.close();
    }

    private static void menu() {
        int resposta = 0;
        do{
            System.out.println("1 - Listar Alojamentos Disponíveis");
            System.out.println("2 - Listar Viaturas Disponíveis");
            System.out.println("3 - Criar Alojamento");
            System.out.println("4 - Criar Viatura");
            System.out.println("5 - Check-in Alojamento");
            System.out.println("6 - Check-out Alojamento");
            System.out.println("7 - Levantar Viatura");
            System.out.println("8 - Entregar Viatura");
            System.out.println("9 - Sair");
            resposta = sc.nextInt();
            switch(resposta){
                case 1: 
                    listarAlojamentos();
                    break;
                case 2:
                    listarViaturas();
                    break;
                case 3:
                    criarAlojamento();
                    break;
                case 4:
                    criarViatura();
                    break;
                case 5:
                    checkInAloj();
                    break;
                case 6:
                    checkOutAloj();
                    break;
                case 7:
                    levantarViatura();
                    break;
                case 8:
                    entregarViatura();
                    break;
                case 9:
                    System.exit(0);
            }
        }while(resposta != 9);
        
        
    }

    private static void listarAlojamentos() {
        ArrayList<Alojamento> lista = agencia.getAlojamentos();
        for(Alojamento aloj : lista){
            if(aloj.isDisponibilidade())
                System.out.println(aloj);
        }
    }

    private static void listarViaturas() {
        ArrayList<Carro> lista = agencia.getCarros();
        for(Carro carro : lista){
            if(carro.getAlugado())
                System.out.println(carro);
        }    
    }

    private static void criarAlojamento() {
    	ArrayList<Alojamento> lista = agencia.getAlojamentos();
    	
    	System.out.println("Introduza o código: ");
    	String codigo = sc.next();
    	System.out.println("Introduza o nome: ");
    	String nome = sc.next();
    	System.out.println("Introduza um local: ");
    	String local = sc.next();
    	System.out.println("Introduza o preço por noite: ");
    	double preco = sc.nextDouble();
    	System.out.println("Introduza a avaliação: ");
    	double avaliacao = sc.nextDouble();
    	System.out.println("Escolha: apartamento(1) ou quarto de hotel(2)");
    	int escolha = sc.nextInt();
    	if(escolha == 1) {
    		System.out.println("Introduza o número de quartos: ");
    		int numQuartos = sc.nextInt();
    		Apartamento apart = new Apartamento(codigo, nome, local, preco, avaliacao, numQuartos);
    		lista.add(apart);
    	}
    	else if(escolha == 2) {
    		System.out.println("Introduza o tipo de quarto: ");
    		String tipoQuarto = sc.next();
    		QuartoHotel quartoHotel = new QuartoHotel(codigo, nome, local, preco, avaliacao, tipoQuarto);
    		lista.add(quartoHotel);
    		
    	}
    	
    }

    private static void criarViatura() {
    	System.out.println("Código: ");
    	String codigo = sc.next();
        System.out.println("Classe: ");
        String classe = sc.next();
        System.out.println("Combustivel: ");
        String combustivel = sc.next();
        Carro car = new Carro(codigo, classe, combustivel);
        agencia.addCarro(car);
    }
    
    private static void checkInAloj() {
        System.out.println("Código Alojamento: ");
        String codigo = sc.next();
        ArrayList<Alojamento> lista = agencia.getAlojamentos();
        for(Alojamento aloj : lista){
            if(aloj.isDisponibilidade() && aloj.getCodigo().equals(codigo)){
                aloj.checkIn();
            }
        }
    }
    
    private static void checkOutAloj() {
    	ArrayList<Alojamento> lista = agencia.getAlojamentos();
        System.out.println("Código Alojamento: ");
        String codigo = sc.next();
        
        for(Alojamento aloj : lista){
            if(!aloj.isDisponibilidade() && aloj.getCodigo().equals(codigo)){
                aloj.checkOut();
            }
        }    
    }
    
    private static void levantarViatura(){
        System.out.println("Código Viatura: ");
        String code = sc.next();
        ArrayList<Carro> lista = agencia.getCarros();
        for(Carro c : lista){
            if(c.getAlugado() && c.getCodigo().equals(code)){
                c.levantar();
            }
        }
    }
    
    private static void entregarViatura(){
      System.out.println("Código Viatura: ");
        String code = sc.next();
        ArrayList<Carro> lista = agencia.getCarros();
        for(Carro c : lista){
            if(!c.getAlugado() && c.getCodigo().equals(code)){
                c.entregar();
            }
        }  
    }
    
}