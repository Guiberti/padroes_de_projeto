package questaoDois;

/*Implementa pagamento via boleto bancário. Segue o contrato da interface,
permitindo adicionar novos tipos sem alterar o cliente.*/

public class Boleto implements iPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via Boleto%n", valor);
    }
}
