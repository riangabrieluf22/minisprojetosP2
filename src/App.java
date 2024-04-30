import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem alice = new Personagem("Alice", 100);
        Personagem roberto = new Personagem("Roberto", 80);

        // Exibindo informações dos personagens
        System.out.println("Personagem: " + alice.getNome() + ", Energia: " + alice.getEnergia());
        System.out.println("Personagem: " + roberto.getNome() + ", Energia: " + roberto.getEnergia());

        // Capítulo 1
        Capitulo capitulo1 = new Capitulo("Capítulo 1",
                "Você acorda em uma ilha desconhecida, deitado em uma praia paradisíaca. À sua frente, você vê uma enorme floresta e uma caverna à direita.",
                "Explorar a floresta.", "Entrar na caverna.", alice, 0, scanner);

        // Mostrar capítulo 1
        capitulo1.mostrar();
        int escolhaCapitulo1 = capitulo1.escolher();

        // Verificar escolha do usuário para capítulo 1
        if (escolhaCapitulo1 == 1) {
            // Capítulo 2A - Desenvolvimento da história de Alice
            Capitulo capitulo2A = new Capitulo("Capítulo 2A",
                    "Enquanto você explora a floresta, você encontra uma tribo nativa. Eles parecem amigáveis. O que você faz?",
                    "Ficar e tentar se comunicar com a tribo.", "Fugir assustado.", alice, -10, scanner);

            capitulo2A.mostrar();
            int escolhaCapitulo2A = capitulo2A.escolher();

            if (escolhaCapitulo2A == 1) {
                System.out.println(
                        "Você consegue se comunicar com a tribo e eles o ajudam a encontrar um caminho de volta para casa.");
                alice.perderEnergia(10, "Ao se esforçar para se comunicar com a tribo.");
            } else if (escolhaCapitulo2A == 2) {
                System.out.println("Você foge, mas acaba se perdendo ainda mais na floresta.");
                alice.perderEnergia(20, "Enquanto corre pela floresta, você tropeça e cai, se machucando.");
            } else {
                System.out.println("Opção inválida!");
            }
        } else if (escolhaCapitulo1 == 2) {
            // Capítulo 2B - Desenvolvimento da história de Roberto
            Capitulo capitulo2B = new Capitulo("Capítulo 2B",
                    "Você entra na caverna escura. Logo dentro, você encontra uma bifurcação. Para onde você vai?",
                    "Seguir pelo caminho à direita.", "Seguir pelo caminho à esquerda.", roberto, 0, scanner);

            capitulo2B.mostrar();
            int escolhaCapitulo2B = capitulo2B.escolher();

            if (escolhaCapitulo2B == 1) {
                System.out.println(
                        "Você encontra uma saída da caverna e descobre que estava próxima da civilização o tempo todo.");
                roberto.perderEnergia(15,
                        "Ao percorrer o caminho à direita, você enfrenta obstáculos que o deixam exausto.");
            } else if (escolhaCapitulo2B == 2) {
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
