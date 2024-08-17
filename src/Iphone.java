//Importação dos apps 
import Apps.AparelhoTelefonico;
import Apps.NavegadorNaInternet;
import Apps.ReprodutorMusical;

// Implementação das interfaces de apps
public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
  int abas;
  // Music Player
  public void tocar(String musica) {
        System.out.println("Tocando: " + musica);
  }
  
    public void pausar(String musica) {
      System.out.println("A musica " + musica + " foi pausada");
    }
  
	  public void selecionarMusica(String musica) {
		  System.out.printf("a %s foi selecionada\n", musica);
	 }

  // Navegador de internet
  public void exibirPagina(String url) {
    System.out.println("Exibindo a pagina: " + url);
    abas = abas + 1;
  }
   
  public void adicionarNovaAba() {
    abas = abas + 1;
    System.out.println("Uma nova aba foi adicionada, você possui " + abas + " abas");
  }
  
  public void atualizarPagina() {
    System.out.println("A pagina atual foi atualizada");
  }

// Aparelho Telefonico

  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  public void atender() {
    System.out.println("Atendendo");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio-voz");
  }

}