package questaoDois;

/*Implementa pagamento via cartão de crédito. Segue o contrato da interface,
permitindo flexibilidade no processamento.*/

public class CartaoCredito implements iPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via Cartão de Crédito%n", valor);
    }
}
