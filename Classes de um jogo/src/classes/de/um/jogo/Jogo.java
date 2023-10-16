
package classes.de.um.jogo;
public class Jogo {
    private String nome;
    private int idade;
    private String tipo;

    public Jogo (String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = "";

        if (tipo.equals("mago")) {
            ataque = "magia";
        } else if (tipo.equals("guerreiro")) {
            ataque = "espada";
        } else if (tipo.equals("monge")) {
            ataque = "artes marciais";
        } else if (tipo.equals("ninja")) {
            ataque = "shuriken";
        }

        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
    public static void main(String[] args) {
      Jogo jogador1 = new Jogo("Aragorn", 30, "guerreiro");
        Jogo jogador2 = new Jogo("Gandalf", 60, "mago");

        jogador1.atacar();
        jogador2.atacar();
    }
    
}
