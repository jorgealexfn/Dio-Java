package POO;

public class Carro extends Veiculo {
	// extends liga uma classe com a outra, podendo usar cada var
	
	
	public void ligar() {
		
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel( ) {
		//deixar private pois o motorista nao tem a necessidade de ver o teste
		System.out.println("conferindo combustivel");
	}
	private void confereCambio( ) {
		System.out.println("conferindo cambio em P");
	}
}
