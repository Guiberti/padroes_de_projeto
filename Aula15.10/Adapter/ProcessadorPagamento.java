package Adapter;

public interface ProcessadorPagamento {

    public boolean validarCartao(String cartao);
    public void processarPagamento(double valor);

}
