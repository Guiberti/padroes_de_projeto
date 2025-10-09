package questaoTres;

/*Interface Observer que define o método atualizar, garantindo que todos os
leitores implementem a notificação.*/

public interface iLeitor {
    void atualizar(String topico, String noticia);
}
