package estrategia;

import efeitos.EfeitoStatus;
import efeitos.Sangramento;

public class EspadaLonga implements Arma {

    @Override
    public void atacar(String atacante, String alvo) {
        System.out.println(atacante + " desfere um corte profundo em " + alvo + " com sua Espada Longa!");
    }

    @Override
    public EfeitoStatus obterEfeito() {
        return new Sangramento();
    }

    @Override
    public String obterNome() {
        return "Espada Longa";
    }
}
