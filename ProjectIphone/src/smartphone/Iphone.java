package smartphone;

import 	multifuncao.interligacao;
import multifuncao.musica.RepodutorMusical;
import multifuncao.pesquisar.NavegadorInternet;
import multifuncao.telefonema.AparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		
		interligacao interli = new interligacao();
	
		//navagador
		NavegadorInternet safari = interli;
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		safari.exibirPagina();
		
		//player
		RepodutorMusical spotify = interli;
		spotify.selecionarMusica();
		spotify.tocarMusica();
		spotify.pausarMusica();
		
		//disgagem
		AparelhoTelefonico telefone = interli;
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();
	}
		
	
}
