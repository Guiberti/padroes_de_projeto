package CorrecaoSistemasPgtoMultiplataforma;

public class SistemaDePagamento {
    public static void main(String[] args) {
        ServicePgto service = new ServicePgto();
        service.pagar(new FabricaCartao("909998"), 10000 );
    }
}
