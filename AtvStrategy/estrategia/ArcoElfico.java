package estrategia;

import efeitos.EfeitoStatus;
import efeitos.Queimadura;

public class ArcoElfico implements Arma {

    @Override
    public void atacar(String atacante, String alvo) {
        System.out.println(atacante + " dispara uma chuva de flechas em " + alvo + "!");
    }

    @Override
    public EfeitoStatus obterEfeito() {
        return new Queimadura();
    }

    @Override
    public String obterNome() {
        return "Arco Élfico";
    }
}
