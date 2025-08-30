package SitemaDePagamentoMultiplataforma;

public class PagamentoCriptomoeda implements Pagamento {
    private double saldoCarteira = 0.05;
    private final double TAXA_CONVERSAO_BTC_BRL = 350000.00;

    private boolean temSaldoSuficiente(double valorEmBRL) {
        double valorEmBTC = valorEmBRL / TAXA_CONVERSAO_BTC_BRL;
        System.out.printf("Verificando saldo... Necessário: %.8f BTC. Disponível: %.8f BTC.%n", valorEmBTC, saldoCarteira);
        return saldoCarteira >= valorEmBTC;
    }

    @Override
    public String processarPagamento(double valor) {
        if (temSaldoSuficiente(valor)) {
            String mensagem = String.format("Pagamento de R$ %.2f (em Cripto) processado com sucesso.", valor);
            System.out.println(mensagem);
            return mensagem;
        } else {
            String erro = "Falha no pagamento: Saldo insuficiente na carteira de criptomoedas.";
            System.out.println(erro);
            return erro;
        }
    }
}
