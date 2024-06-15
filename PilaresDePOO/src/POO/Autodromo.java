package POO;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.setChassi("666DIO");
		jeep.ligar();
		
		Moto CB250 = new Moto();
		CB250.setChassi("258479");
		CB250.ligar();
	}
}
