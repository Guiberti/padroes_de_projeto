package questaoDois;

/**
 * Factory Method: cria processadores de pagamento
 *
 * Justificativa do padrão:
 * - Permite instanciar diferentes meios de pagamento (Cartão, Boleto, PIX) sem que o cliente conheça os detalhes.
 * - Facilita a manutenção e extensão do sistema.
 */

public class FabricaPagamento {

    public enum TipoPagamento {CARTAO, BOLETO, PIX}

    public static iPagamento criarPagamento(TipoPagamento tipo) {
        switch (tipo) {
            case CARTAO:
                return new CartaoCredito();
            case BOLETO:
                return new Boleto();
            case PIX:
                return new Pix();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
    }
}
