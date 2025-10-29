package personagens;

import estrategia.Arma;

import java.util.Random;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, Arma arma) {
        super(nome, 90, 80, arma);
    }

    @Override
    public void receberDano(int dano) {
        Random rand = new Random();
        if (rand.nextInt(100) < 25) { // 25% de chance de esquiva
            System.out.println(nome + " esquivou do ataque!");
        } else {
            super.receberDano(dano);
        }
    }
}
