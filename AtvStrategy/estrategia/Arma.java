package estrategia;

import efeitos.EfeitoStatus;

public interface Arma {
    void atacar(String atacante, String alvo);
    EfeitoStatus obterEfeito();
    String obterNome();
}
