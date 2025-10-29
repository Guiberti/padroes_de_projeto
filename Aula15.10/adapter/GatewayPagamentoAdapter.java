package adapter;

public class GatewayPagamentoAdapter implements ProcessadorPagamento {

    //1.1 Propriedade privada apontando para a classe incompatível
    private GatewayPagamentoLegado gatewayLegado;

    //1.2  Construtor que recebe um objeto da classe incompatível
    public GatewayPagamentoAdapter(GatewayPagamentoLegado gateway) {
        this.gatewayLegado = gateway;
    }

    @Override
    public boolean validarCartao(String cartao) {
        return this.gatewayLegado.verificarCartaoCredito(cartao);
    }

    @Override
    public void processarPagamento(double valor) {
        String moeda = "BRL"; //Será necessárop resolver os argumentos que os métodos incompatíveis requerem
        this.gatewayLegado.efetuarPagamento(valor, moeda);
    }
}
