package questaoDois;

/*Interface que define o método processar para qualquer forma de pagamento,
garantindo que todos os tipos sigam o mesmo contrato (Strategy leve).*/

public interface iPagamento {
    void processar(double valor);
}
