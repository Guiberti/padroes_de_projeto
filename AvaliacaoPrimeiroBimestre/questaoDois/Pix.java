package questaoDois;

/*Implementa pagamento via PIX. Segue o contrato da interface,
garantindo consistência e extensibilidade.*/

public class Pix implements iPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via PIX%n", valor);
    }
}
