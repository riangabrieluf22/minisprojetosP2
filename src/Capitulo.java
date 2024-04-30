import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem,
            int alteracaoEnergia, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
    }

    public void mostrar() {
        System.out.println("Nome do Capítulo: " + nome);
        System.out.println("Texto do Capítulo: " + texto);
        System.out.println("Escolha 1: " + escolha1);
        System.out.println("Escolha 2: " + escolha2);
        System.out.println("-----------------------------------");

        // Alterar energia do personagem
        personagem.setEnergia(alteracaoEnergia);
    }

    public int escolher() {
        int escolha;
        do {
            System.out.print("Escolha uma opção (1 ou 2): ");
            String input = escaneador.nextLine();
            if (input.equals("1") || input.equals("2")) {
                escolha = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
            }
        } while (true);
        return escolha;
    }
}
