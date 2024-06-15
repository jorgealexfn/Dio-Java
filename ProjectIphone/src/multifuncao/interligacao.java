package multifuncao;

import multifuncao.musica.RepodutorMusical;
import multifuncao.pesquisar.NavegadorInternet;
import multifuncao.telefonema.AparelhoTelefonico;

public class interligacao implements RepodutorMusical, NavegadorInternet, AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("LIGANDO PARA O NUMERO DESEJADO...");
	}

	@Override
	public void atender() {
		
		System.out.println("EM LIGAÇÃO...");
	}

	@Override
	public void iniciarCorreioVoz() {
		
		System.out.println("FIM DE CHAMADA...");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("ABRINDO O NAVEGADOR...");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("ALTERANDO A URL PARA O SITE DESEJADO...");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("ATUALIZANDO A PAGINA...");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("SELECIOANDO MUSICA...");
	}
	
	@Override
	public void tocarMusica() {
		// TODO Auto-generated method stub
		System.out.println("TOAR MUSICA...");
	}

	
	
	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
		System.out.println("MUSICA PAUSADA...");
	}

	

}
