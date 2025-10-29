package estrategia;
import efeitos.EfeitoStatus;
import efeitos.Sangramento;

public class AdagaSombria implements Arma {

    @Override
    public void atacar(String atacante, String alvo) {
        System.out.println(atacante + " realiza um ataque furtivo em " + alvo + " com sua Adaga Sombria!");
    }

    @Override
    public EfeitoStatus obterEfeito() {
        return new Sangramento();
    }

    @Override
    public String obterNome() {
        return "Adaga Sombria";
    }
}
