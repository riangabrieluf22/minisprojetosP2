import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Seleção do personagem
        System.out.println("Escolha com qual personagem você deseja jogar:");
        System.out.println("1. Alice (energia: 100)");
        System.out.println("2. Roberto (energia: 80)");

        // Capturar escolha do usuário
        String escolhaPersonagem = scanner.nextLine();

        Personagem personagemSelecionado = null;
        Personagem sophia = new Personagem("Sophia", 90); // Inicializando Sophia com energia 90

        // Verificar escolha do usuário
        if (escolhaPersonagem.equals("1")) {
            personagemSelecionado = new Personagem("Alice", 100);
        } else if (escolhaPersonagem.equals("2")) {
            personagemSelecionado = new Personagem("Roberto", 80);
        } else {
            System.out.println("Opção inválida!");
            System.exit(0); // Encerrar o programa se a escolha for inválida
        }

        // Exibir informações do personagem selecionado
        System.out.println("Você selecionou jogar com " + personagemSelecionado.getNome() + " (energia: "
                + personagemSelecionado.getEnergia() + ")");
        System.out.println("Energia de Sophia: " + sophia.getEnergia()); // Mostrar energia de Sophia

        // Capítulo 1
        String capitulo1 = "Você acorda em uma ilha desconhecida, deitado em uma praia paradisíaca. À sua frente, você vê uma enorme floresta e uma caverna à direita.";
        String escolha1Floresta = "Você decide explorar a floresta.";
        String escolha1Caverna = "Você decide entrar na caverna.";

        // Mostrar capítulo 1
        System.out.println(capitulo1);
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Explorar a floresta.");
        System.out.println("2. Entrar na caverna a dentro.");

        // Capturar escolha do usuário
        String escolhaCapitulo1 = scanner.nextLine();

        // Verificar escolha do usuário
        if (escolhaCapitulo1.equals("1")) {
            System.out.println(escolha1Floresta);
            // Capítulo 2A
            String capitulo2A = "Enquanto você explora a floresta, você encontra uma tribo nativa. Eles parecem amigáveis. O que você faz?";
            String escolha2AFicar = "Você decide ficar e tentar se comunicar com a tribo.";
            String escolha2AFugir = "Você decide fugir assustado.";

            // Mostrar capítulo 2A
            System.out.println(capitulo2A);
            System.out.println("Escolha o que fazer:");
            System.out.println("1. Ficar e tentar se comunicar com a tribo.");
            System.out.println("2. Fugir assustado.");

            // Capturar escolha do usuário
            String escolhaCapitulo2A = scanner.nextLine();

            // Verificar escolha do usuário
            if (escolhaCapitulo2A.equals("1")) {
                System.out.println(escolha2AFicar);
                System.out.println(
                        "Você consegue se comunicar com a tribo e eles o ajudam a encontrar um caminho de volta para casa.");
                personagemSelecionado.perderEnergia(10); // Exemplo de perda de energia
            } else if (escolhaCapitulo2A.equals("2")) {
                System.out.println(escolha2AFugir);
                System.out.println("Você foge, mas acaba se perdendo ainda mais na floresta.");
                personagemSelecionado.perderEnergia(20); // Exemplo de perda de energia
            } else {
                System.out.println("Opção inválida!");
            }
        } else if (escolhaCapitulo1.equals("2")) {
            System.out.println(escolha1Caverna);
            // Capítulo 2B
            String capitulo2B = "Você entra na caverna escura. Logo dentro, você encontra uma bifurcação. Para onde você vai?";
            String escolha2BDireita = "Você escolhe o caminho à direita.";
            String escolha2BEsquerda = "Você escolhe o caminho à esquerda.";

            // Mostrar capítulo 2B
            System.out.println(capitulo2B);
            System.out.println("Escolha o que fazer:");
            System.out.println("1. Seguir pelo caminho à direita.");
            System.out.println("2. Seguir pelo caminho à esquerda.");

            // Capturar escolha do usuário
            String escolhaCapitulo2B = scanner.nextLine();

            // Verificar escolha do usuário
            if (escolhaCapitulo2B.equals("1")) {
                System.out.println(escolha2BDireita);
                System.out.println(
                        "Você encontra uma saída da caverna e descobre que estava próxima da civilização o tempo todo.");
                personagemSelecionado.perderEnergia(15); // Exemplo de perda de energia
            } else if (escolhaCapitulo2B.equals("2")) {
                System.out.println(escolha2BEsquerda);
                System.out.println("Você encontra um tesouro escondido na escuridão da caverna.");
                personagemSelecionado.ganharEnergia(10); // Exemplo de ganho de energia
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        // Introdução do terceiro personagem (Sophia)
        System.out.println("Enquanto você continua sua jornada, você encontra uma misteriosa viajante chamada Sophia.");

        // Continuação da história com o terceiro personagem (Sophia)
        System.out.println(
                "Sophia sorri para você e diz: 'Olá! Estou explorando esta ilha também. Parece que nossos destinos se cruzaram. Posso me juntar a você?'");

        // Capturar escolha do usuário sobre se Sophia deve se juntar ou não.
        System.out.println("Você permite que Sophia se junte a você?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        String escolhaSophia = scanner.nextLine();

        // Verificar escolha do usuário sobre Sophia se juntar ou não.
        if (escolhaSophia.equals("1")) {
            System.out.println("Você aceita a companhia de Sophia.");
            System.out.println(
                    "Sophia se junta a vocês e compartilha histórias emocionantes de suas próprias aventuras.");
            sophia.ganharEnergia(20); // Sophia ganha energia ao se juntar ao grupo
        } else if (escolhaSophia.equals("2")) {
            System.out.println("Você decide seguir sozinho.");
            System.out.println("Sophia respeita sua decisão e parte sozinha em busca de suas próprias aventuras.");

        } else {
            System.out.println("Opção inválida!");
        }

        // Exibir energia atual do personagem selecionado e de Sophia
        System.out.println("Energia de " + personagemSelecionado.getNome() + ": " + personagemSelecionado.getEnergia());
        System.out.println("Energia de Sophia: " + sophia.getEnergia());

        scanner.close();
    }
}