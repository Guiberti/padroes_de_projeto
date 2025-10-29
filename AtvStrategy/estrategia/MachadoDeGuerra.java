package estrategia;

import efeitos.EfeitoStatus;
import efeitos.Atordoado;

public class MachadoDeGuerra implements Arma {

    @Override
    public void atacar(String atacante, String alvo) {
        System.out.println(atacante + " realiza um golpe esmagador contra " + alvo + " com seu Machado de Guerra!");
    }

    @Override
    public EfeitoStatus obterEfeito() {
        return new Atordoado();
    }

    @Override
    public String obterNome() {
        return "Machado de Guerra";
    }
}
