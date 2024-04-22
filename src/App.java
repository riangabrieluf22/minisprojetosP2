import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Personagem alice = new Personagem("Alice", 100);
        Personagem roberto = new Personagem("Roberto", 80);

        // Exibindo informações dos personagens
        System.out.println("Personagem: " + alice.getNome() + ", Energia: " + alice.getEnergia());
        System.out.println("Personagem: " + roberto.getNome() + ", Energia: " + roberto.getEnergia());

        Scanner scanner = new Scanner(System.in);

        // Capítulo 1
        String capitulo1 = "Você acorda em uma ilha desconhecida, deitado em uma praia paradisíaca. À sua frente, você vê uma enorme floresta e uma caverna à direita.";
        String escolha1Floresta = "Você decide explorar a floresta.";
        String escolha1Caverna = "Você decide entrar na caverna.";

        // Mostrar capítulo 1
        System.out.println(capitulo1);
        System.out.println("Escolha o que fazer:");
        System.out.println("1. Explorar a floresta.");
        System.out.println("2. Entrar na caverna.");

        // Capturar escolha do usuário
        String escolhaCapitulo1 = scanner.nextLine();

        // Verificar escolha do usuário
        if (escolhaCapitulo1.equals("1")) {
            System.out.println(escolha1Floresta);
            // Capítulo 2A - Desenvolvimento da história de Alice
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
                alice.perderEnergia(10, "Ao se esforçar para se comunicar com a tribo.");
            } else if (escolhaCapitulo2A.equals("2")) {
                System.out.println(escolha2AFugir);
                System.out.println("Você foge, mas acaba se perdendo ainda mais na floresta.");
                alice.perderEnergia(20, "Enquanto corre pela floresta, você tropeça e cai, se machucando.");
            } else {
                System.out.println("Opção inválida!");
            }
        } else if (escolhaCapitulo1.equals("2")) {
            System.out.println(escolha1Caverna);
            // Capítulo 2B - Desenvolvimento da história de Roberto
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
                roberto.perderEnergia(15,
                        "Ao percorrer o caminho à direita, você enfrenta obstáculos que o deixam exausto.");
            } else if (escolhaCapitulo2B.equals("2")) {
                System.out.println(escolha2BEsquerda);
                System.out.println("Você encontra um tesouro escondido na escuridão da caverna.");
                roberto.ganharEnergia(10, "Você encontra um tesouro energizante que revitaliza suas forças.");
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        // Verificar se a energia dos personagens chegou a zero e exibir mensagens
        // apropriadas
        if (alice.getEnergia() <= 0) {
            System.out.println(alice.getNome() + " ficou esgotado!");
        }
        if (roberto.getEnergia() <= 0) {
            System.out.println(roberto.getNome() + " ficou esgotado!");
        }

        // Exibir energia atual dos personagens
        System.out.println("Energia de " + alice.getNome() + ": " + alice.getEnergia());
        System.out.println("Energia de " + roberto.getNome() + ": " + roberto.getEnergia());

        scanner.close();
    }
}
