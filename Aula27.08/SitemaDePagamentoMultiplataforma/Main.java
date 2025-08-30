package SitemaDePagamentoMultiplataforma;

public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        System.out.println("----- INÍCIO DA SIMULAÇÃO DE PAGAMENTOS -----\n");

        // Simular pagamento por cartão de crédito
        System.out.println(">> Processando pagamento com Cartão de Crédito:");
        service.processarPagamento(new FactoryCartaoCredito(), 150.00);
        System.out.println("-------------------------------------------------");

        // Simular pagamento por PayPal
        System.out.println(">> Processando pagamento com PayPal:");
        service.processarPagamento(new FactoryPayPal(), 75.00);
        System.out.println("-------------------------------------------------");

        // Simular pagamento por Criptomoeda (com saldo suficiente)
        System.out.println(">> Processando pagamento com Criptomoeda (valor baixo):");
        service.processarPagamento(new FactoryCriptomoeda(), 10000.00);
        System.out.println("-------------------------------------------------");

        // Simular pagamento por Criptomoeda (com saldo insuficiente)
        System.out.println(">> Processando pagamento com Criptomoeda (valor alto):");
        service.processarPagamento(new FactoryCriptomoeda(), 200000.00);
        System.out.println("-------------------------------------------------");

        // Simular pagamento com o novo metodo Apple Pay
        System.out.println(">> Processando pagamento com Apple Pay:");
        service.processarPagamento(new FactoryApplePay(), 250.00);
        System.out.println("-------------------------------------------------");

        System.out.println("\n----- FIM DA SIMULAÇÃO -----");
    }
}
