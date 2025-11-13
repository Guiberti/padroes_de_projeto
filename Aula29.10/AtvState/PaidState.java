package AtvState;

public class PaidState implements OrderState {
    private Order contexto;

    public PaidState(Order contexto) {
        this.contexto = contexto;
    }

    @Override
    public void pagar() {
        System.out.println("ℹAviso: O pedido já está pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido despachado. Transicionando para o estado: Enviado.");
        this.contexto.setEstado(new ShippedState(this.contexto));
    }

    @Override
    public void entregar() {
        System.out.println("Erro: O pedido deve ser enviado antes de ser entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado. Transicionando para o estado: Cancelado.");
        this.contexto.setEstado(new CanceledState(this.contexto));
    }
}
