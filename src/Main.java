import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Iphone meuiphone = new Iphone();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        int option = 0;
        String musica;

        while (continuar) {
            try {
                System.out.println("Qual aplicativo deseja abrir?");
                System.out.println("1° Music Player. \n2° Navegador. \n3° Telefone.");
                option = input.nextInt();
                input.nextLine(); // Consumir a nova linha pendente
                continuar = false;
            } catch (Exception e) {
                System.out.println("Opção inválida, por favor tente novamente");
                input.next(); // Consumir a entrada inválida
            }
        }

        boolean continar2 = true;
        while (continar2) {
            try {
                if (option == 1) {
                    System.out.println("Music Player aberto");
                    System.out.println("Quais opções deseja fazer no Music Player\n1° Tocar. \n2° Pausar. \n3° Selecionar Musica \n4° Fechar o Music Player");
                    int appOption = input.nextInt();
                    input.nextLine(); // Consumir a nova linha pendente

                    switch (appOption) {
                        case 1:
                            System.out.println("Tocar aberto, digite a música que deseja tocar: ");
                            musica = input.nextLine();
                            meuiphone.tocar(musica);
                            break;
                        case 2:
                            System.out.println("Música pausada");
                            break;
                        case 3:
                            System.out.println("Selecione uma nova música");
                            musica = input.nextLine();
                            meuiphone.selecionarMusica(musica);
                            break;
                        case 4:
                            continar2 = false;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } else if (option == 2) {
                    System.out.println("Navegador aberto");
                    System.out.println("Quais opções deseja fazer no Navegador\n1° Exibir Página. \n2° Adicionar Nova Aba. \n3° Atualizar Página. \n4° Fechar o Navegador.");
                    int appOption = input.nextInt();
                    input.nextLine(); // Consumir a nova linha pendente

                    switch (appOption) {
                        case 1:
                            System.out.println("Digite a URL do site que deseja abrir:");
                            String url = input.nextLine();
                            meuiphone.exibirPagina(url);
                            break;
                        case 2:
                            meuiphone.adicionarNovaAba();
                            break;
                        case 3:
                            meuiphone.atualizarPagina();
                            break;
                        case 4:
                            continar2 = false;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } else if (option == 3) {
                    System.out.println("Telefone aberto");
                    System.out.println("Quais opções deseja fazer no telefone \n1° Ligar. \n2° Atender. \n3° Iniciar correio de voz. \n4° Fechar o telefone");
                    int appOption = input.nextInt();
                    input.nextLine(); // Consumir a nova linha pendente

                    switch (appOption) {
                        case 1:
                            System.out.println("Digite o número que deseja ligar:");
                            String num = input.nextLine();
                            meuiphone.ligar(num);
                            break;
                        case 2:
                            meuiphone.atender();
                            break;
                        case 3:
                            meuiphone.iniciarCorreioVoz();
                            break;
                        case 4:
                            continar2 = false;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Resposta inválida");
                input.next(); // Consumir a entrada inválida
            }
        }
        input.close();
    }
}
