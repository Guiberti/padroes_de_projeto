package CorrecaoSistemasPgtoMultiplataforma;

public class FabricaCartao extends AbsFabricaPgto{
    private String numeroCartao;
    public FabricaCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    public iPgto criar() {
        return new PgtoCartao(this.numeroCartao);
    }
}
