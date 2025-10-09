package questaoDois;

/**
 * Singleton: Gerenciador de Pagamentos
 *
 * Garante um ponto único de acesso para processar pagamentos.
 * Justificativa do padrão:
 * - Singleton: evita múltiplas instâncias do gerenciador.
 * - Factory Method (via FabricaPagamento): permite criar dinamicamente o tipo de pagamento sem acoplamento.
 */

public class GerenciadorPagamentos {

    private static GerenciadorPagamentos instancia;

    private GerenciadorPagamentos() {
    }

    public static GerenciadorPagamentos getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorPagamentos();
        }
        return instancia;
    }

    public void processarPagamento(FabricaPagamento.TipoPagamento tipo, double valor) {
        iPagamento pagamento = FabricaPagamento.criarPagamento(tipo);
        pagamento.processar(valor);
    }
}
