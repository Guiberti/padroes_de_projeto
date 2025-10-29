package personagens;

import estrategia.Arma;
import efeitos.EfeitoStatus;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int mana;
    protected Arma arma;

    public Personagem(String nome, int vida, int mana, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
    }

    public void atacar(Personagem alvo) {
        if (arma == null) {
            System.out.println(nome + " não possui arma equipada!");
            return;
        }

        arma.atacar(nome, alvo.nome);

        EfeitoStatus efeito = arma.obterEfeito();
        if (efeito != null) {
            efeito.aplicar(alvo.nome);
        }

        alvo.receberDano(armaDanoBase());
    }

    protected int armaDanoBase() {
        return 15;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. (Vida restante: " + vida + ")");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void trocarArma(Arma novaArma) {
        this.arma = novaArma;
        System.out.println(nome + " equipou " + novaArma.obterNome());
    }

    public String getNome() {
        return nome;
    }
}
