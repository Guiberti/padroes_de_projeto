package Adapter;

public class SistemaPagamento {

    public static void main(String[] args) {
        ProcessadorPagamento processador;

        processador = new GatewayPagamentoAdapter(
                new GatewayPagamentoLegado()
        );

        String cartao = "1234567812345678";
        if (processador.validarCartao(cartao)) {
            processador.processarPagamento(150.0);
        }
    }
}
