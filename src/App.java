import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capítulo 1
        String capitulo1 = "Você acorda em uma ilha desconhecida, deitado em uma praia paradisiaca. À sua frente, você vê uma enorme floresta e uma caverna à direita.";
        String escolha1Floresta = "Você decide explorar a floresta.";
        String escolha1Caverna = "Você decide entrar na caverna.";

        // Mostrar capítulo 1
        System.out.println(capitulo1);
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Explorar a floresta.");
        System.out.println("2. Entrar na caverna a dentro.");

        // Capturar escolha do usuário
        String escolhaCapitulo1 = scanner.nextLine();

        // Verificar escolha do usuáriop
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
            } else if (escolhaCapitulo2A.equals("2")) {
                System.out.println(escolha2AFugir);
                System.out.println("Você foge, mas acaba se perdendo ainda mais na floresta.");
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
            } else if (escolhaCapitulo2B.equals("2")) {
                System.out.println(escolha2BEsquerda);
                System.out.println("Você encontra um tesouro escondido na escuridão da caverna.");
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
