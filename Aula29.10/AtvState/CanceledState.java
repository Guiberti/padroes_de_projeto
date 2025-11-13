package AtvState;

public class CanceledState implements OrderState {
    private Order contexto;

    public CanceledState(Order contexto) {
        this.contexto = contexto;
    }

    @Override
    public void pagar() {
        System.out.println("Erro: O pedido foi cancelado e não pode ser pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Erro: O pedido foi cancelado e não pode ser enviado.");
    }

    @Override
    public void entregar() {
        System.out.println("Erro: O pedido foi cancelado e não pode ser entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("ℹAviso: O pedido já está cancelado.");
    }
}
