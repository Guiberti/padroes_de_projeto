package AtvState;

public class Order {

    private OrderState estadoAtual;

    public Order() {
        this.estadoAtual = new NewState(this);
        System.out.println("Pedido criado. Estado inicial: Novo.");
    }

    public void setEstado(OrderState novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void pagar() {
        this.estadoAtual.pagar();
    }

    public void enviar() {
        this.estadoAtual.enviar();
    }

    public void entregar() {
        this.estadoAtual.entregar();
    }

    public void cancelar() {
        this.estadoAtual.cancelar();
    }

    public String getEstadoNome() {
        return this.estadoAtual.getClass().getSimpleName();
    }

}
