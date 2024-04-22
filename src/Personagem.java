public class Personagem {

    private String nome;
    private int energia;
    private static final int MAX_ENERGIA = 100;

    // Construtor
    public Personagem(String nome, int energia) {
        this.nome = nome;
        setEnergia(energia); // Garantindo que a energia inicial não ultrapasse o máximo
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
        // Garantindo que a energia não ultrapasse o máximo
        if (this.energia > MAX_ENERGIA) {
            this.energia = MAX_ENERGIA;
        }
    }

    // Método para perder energia
    public void perderEnergia(int quantidade, String motivo) {
        energia -= quantidade;
        if (energia <= 0) {
            energia = 0;
            System.out.println(nome + " ficou esgotado! (" + motivo + ")");
        } else {
            System.out.println(nome + " perdeu " + quantidade + " pontos de energia. (" + motivo + ")");
        }
    }

    // Método para ganhar energia
    public void ganharEnergia(int quantidade, String motivo) {
        energia += quantidade;
        // Garantindo que a energia não ultrapasse o máximo
        if (energia > MAX_ENERGIA) {
            energia = MAX_ENERGIA;
        }
        System.out.println(nome + " ganhou " + quantidade + " pontos de energia. (" + motivo + ")");
    }
}
