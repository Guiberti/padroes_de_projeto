package personagens;

import estrategia.Arma;

public class Mago extends Personagem {

    public Mago(String nome, Arma arma) {
        super(nome, 70, 150, arma);
    }

    public void regenerarMana() {
        mana += 10;
        System.out.println(nome + " regenerou 10 de mana. (Mana atual: " + mana + ")");
    }
}