package questaoDois;

/*Demonstra o uso do Singleton + Factory Method, mostrando como processar
 diferentes meios de pagamento sem acoplar o cliente.*/

public class Main {
    public static void main(String[] args) {
        GerenciadorPagamentos gerenciador = GerenciadorPagamentos.getInstancia();

        gerenciador.processarPagamento(FabricaPagamento.TipoPagamento.CARTAO, 150.0);
        gerenciador.processarPagamento(FabricaPagamento.TipoPagamento.BOLETO, 200.0);
        gerenciador.processarPagamento(FabricaPagamento.TipoPagamento.PIX, 50.0);
    }
}
