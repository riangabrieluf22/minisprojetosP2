public class Personagem {
    private String nome;
    private int energia;

    // Construtor
    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    // Método para perder energia
    public void perderEnergia(int quantidade) {
        energia -= quantidade;
        if (energia < 0) {
            energia = 0;
        }
    }

    // Método para ganhar energia
    public void ganharEnergia(int quantidade) {
        energia += quantidade;
    }
}