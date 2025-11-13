package AtvState;

public class DeliveredState implements OrderState {
    private Order contexto;

    public DeliveredState(Order contexto) {
        this.contexto = contexto;
    }

    @Override
    public void pagar() {
        System.out.println("ℹAviso: O pedido foi entregue. Nenhuma ação permitida.");
    }

    @Override
    public void enviar() {
        System.out.println("ℹAviso: O pedido foi entregue. Nenhuma ação permitida.");
    }

    @Override
    public void entregar() {
        System.out.println("ℹAviso: O pedido já foi entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Erro: O pedido foi entregue e não pode ser cancelado.");
    }
}