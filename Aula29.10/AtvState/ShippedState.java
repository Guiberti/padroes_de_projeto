package AtvState;

public class ShippedState implements OrderState {
    private Order contexto;

    public ShippedState(Order contexto) {
        this.contexto = contexto;
    }

    @Override
    public void pagar() {
        System.out.println("Aviso: O pedido já está pago e foi enviado.");
    }

    @Override
    public void enviar() {
        System.out.println("Aviso: O pedido já está em trânsito (Enviado).");
    }

    @Override
    public void entregar() {
        System.out.println("Entrega confirmada. Transicionando para o estado: Entregue.");
        this.contexto.setEstado(new DeliveredState(this.contexto));
    }

    @Override
    public void cancelar() {
        System.out.println("Erro: Pedidos enviados não podem ser cancelados diretamente.");
    }
}
