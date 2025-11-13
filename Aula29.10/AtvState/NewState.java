package AtvState;

public class NewState implements OrderState {
    private Order contexto;

    public NewState(Order contexto) {
        this.contexto = contexto;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento registrado. Transicionando para o estado: Pago.");
        this.contexto.setEstado(new PaidState(this.contexto));
    }

    @Override
    public void enviar() {
        System.out.println("Erro: O pedido deve ser pago antes de ser enviado.");
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