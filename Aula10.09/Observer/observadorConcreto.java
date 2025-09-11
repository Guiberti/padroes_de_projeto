package Observer;

public class observadorConcreto extends absObservador {

    public observadorConcreto(observado objeto_de_interesse) {
        this.objeto_de_interesse = objeto_de_interesse;
        this.objeto_de_interesse.inscrever(this);
    }

    @Override
    void update() {
        System.out.println("Notificação Recebida" + this);
    }

    public void remover_inscricao() {
        this.objeto_de_interesse.remover(this);
    }
}
