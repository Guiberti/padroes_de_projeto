package Observer;

import java.util.ArrayList;
import java.util.List;

public class observado {
    private int estado;
    private List<absObservador> observadores = new ArrayList<absObservador>();

    public void setEstado(int valor) {
        this.estado = valor;
        this.notificarTodosObservadores();
    }

    public int getEstado() {
        return this.estado;
    }

    private void notificarTodosObservadores() {
        for (absObservador observador : this.observadores) {
            observador.update();
        }
    }

    public void inscrever(absObservador observador) {
        this.observadores.add(observador);
    }

    public void remover(absObservador observador) {
        this.observadores.remove(observador);
    }
}
 