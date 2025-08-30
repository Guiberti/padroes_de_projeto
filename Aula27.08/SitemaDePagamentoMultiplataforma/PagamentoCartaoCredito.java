package SitemaDePagamentoMultiplataforma;

public class PagamentoCartaoCredito implements Pagamento{
    private final String numeroCartao = "1234567890123456";

    private boolean validarCartao() {
        System.out.println("Validando cartão de crédito...");

        if (numeroCartao != null && numeroCartao.length() == 16) {
            System.out.println("Número de cartão foi validado!");
            return true;
        }
        System.out.println("RRO: Número de cartão inválido.");
        return false;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarCartao()) {
            String mensagem = String.format("Pagamento de R$ %.2f com Cartão de Crédito processado com sucesso.", valor);
            System.out.println(mensagem);
            return mensagem;
        } else {
            String erro = "Falha no pagamento: Cartão de crédito inválido.";
            System.out.println(erro);
            return erro;
        }
    }
}
