package personagens;

import estrategia.Arma;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, Arma arma) {
        super(nome, 120, 50, arma);
    }

    @Override
    public void receberDano(int dano) {
        int danoReduzido = (int) (dano * 0.8); // Pele Dura - reduz 20%
        super.receberDano(danoReduzido);
    }
}
