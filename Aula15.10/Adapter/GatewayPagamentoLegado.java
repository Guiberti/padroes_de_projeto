package Adapter;

public class GatewayPagamentoLegado {

    public void efetuarPagamento(double valor, String moeda) {
        System.out.println("Pagamento no valor: " + valor + " moeda: " + moeda);
    }

    public boolean verificarCartaoCredito(String cartao) {
        return cartao != null && cartao.length() == 16;
    }

}
