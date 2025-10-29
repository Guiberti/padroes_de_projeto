package estrategia;

import efeitos.EfeitoStatus;
import efeitos.Queimadura;

public class CajadoArcano implements Arma {

    @Override
    public void atacar(String atacante, String alvo) {
        System.out.println(atacante + " conjura uma Bola de Fogo contra " + alvo + "!");
    }

    @Override
    public EfeitoStatus obterEfeito() {
        return new Queimadura();
    }

    @Override
    public String obterNome() {
        return "Cajado Arcano";
    }
}