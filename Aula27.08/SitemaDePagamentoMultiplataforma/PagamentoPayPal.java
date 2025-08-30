package SitemaDePagamentoMultiplataforma;

public class PagamentoPayPal implements Pagamento{

    private final String emailUsuario = "cliente@email.com";

    private boolean isEmailVinculado() {
        System.out.println("Verificando se a conta PayPal está vinculada ao e-mail: " + emailUsuario);
        return emailUsuario != null && emailUsuario.contains("@");
    }

    @Override
    public String processarPagamento(double valor) {
        if (isEmailVinculado()) {
            String mensagem = String.format("Pagamento de R$ %.2f com PayPal processado com sucesso.", valor);
            System.out.println(mensagem);
            return mensagem;
        } else {
            String erro = "Falha no pagamento: Conta PayPal não vinculada.";
            System.out.println(erro);
            return erro;
        }
    }

}
