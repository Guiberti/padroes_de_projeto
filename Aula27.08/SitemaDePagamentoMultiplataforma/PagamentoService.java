package SitemaDePagamentoMultiplataforma;

public class PagamentoService {
    public void processarPagamento(PagamentoFactory factory, double valor) {
        Pagamento metodoDePagamento = factory.criarPagamento();
        metodoDePagamento.processarPagamento(valor);
    }
}
