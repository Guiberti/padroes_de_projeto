package CorrecaoSistemasPgtoMultiplataforma;

public class PgtoCartao implements iPgto {

    public PgtoCartao(String numeroCartao){
        try {
            if (numeroCartao.equals("909998")){
                this.numeroCartao = numeroCartao;
            } else {
                throw new Exception("Cartão inválido");
            }
        }
        catch (Exception e) {
            System.out.println("Número cc inválido");
        }
    }

    public String numeroCartao;
    public double valor;


    public void pagar() {
        System.out.println("CC - Pagamento efetuado");
    }
}
