package aula08;

public class Ex8_1 {
	static Empresa agencia;

	public static void main(String[] args) {
		AutoLigeiro mercedes = new AutoLigeiro("45-BG-56", "Mercedes", "A", 500, "FIDKVOSOFOSVDDS", 2);
		PesadoPassageiros autocarro = new PesadoPassageiros("B9-HH-21", "X", "Sport", 450, "KGFFVH", 3250, 42);
		Motociclo moto = new Motociclo("45-KI-89", "Suzuki", "XY", 1300, "Estrada");
		PesadoMerc camiao = new PesadoMerc("56-TT-R5", "Honda", "Civic", 600, "FHETDFJRDGRD", 3, 5000);
		
		agencia = new Empresa("RentIt","3750-314" ,"rentit@gmail.com");
		agencia.add(mercedes);
		agencia.add(autocarro);
		agencia.add(moto);
		agencia.add(camiao);
		
		System.out.println(mercedes);
		System.out.println(autocarro);
		System.out.println(moto);
		System.out.println(camiao);
		
		
		System.out.println(agencia);
		
		mercedes.trajeto(200);
		moto.trajeto(45);
		autocarro.trajeto(100);
		mercedes.trajeto(44);
		camiao.trajeto(30);
		
		System.out.println("\nDistância total");
		System.out.printf("Mercedes: %d km\n", mercedes.distanciaTotal());
		System.out.printf("Mota: %d km\n", moto.distanciaTotal());
		System.out.printf("Autocarro: %d km\n", autocarro.distanciaTotal());
		System.out.printf("Camiao: %d km\n", camiao.distanciaTotal());
		
		System.out.println("\nÚltimo trajeto");
		System.out.printf("Mercedes: %d km\n", mercedes.ultimoTrajeto());
		System.out.printf("Mota: %d km\n", moto.ultimoTrajeto());
		System.out.printf("Auocarro: %d km\n", autocarro.ultimoTrajeto());
		System.out.printf("Camiao: %d km\n", camiao.ultimoTrajeto());
	
	
		System.out.println("\nViatura com mais kilometros:");
		System.out.println(maisKm());
		
		

	}
	
	private static Veiculo maisKm() {
		int maior=0;
		Veiculo x = null;
		for(Veiculo v : agencia.viaturas) {
			if(v.distanciaTotal()>maior) {
				maior=v.distanciaTotal();
				x=v;
			}
		}
			
		return x;
		
		
	}

}
