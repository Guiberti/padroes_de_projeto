package SitemaDePagamentoMultiplataforma;

public class PagamentoApplePay implements Pagamento{
    private boolean isDispositivoCompativel() {
        System.out.println("Validando dispositivo para Apple Pay...");
        System.out.println("Dispositivo compatível.");
        return true;
    }

    @Override
    public String processarPagamento(double valor) {
        if (isDispositivoCompativel()) {
            String mensagem = String.format("Pagamento de R$ %.2f com Apple Pay processado com sucesso.", valor);
            System.out.println(mensagem);
            return mensagem;
        } else {
            String erro = "Falha no pagamento: Dispositivo não compatível com Apple Pay.";
            System.out.println(erro);
            return erro;
        }
    }
}
