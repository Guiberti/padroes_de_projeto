package ObserverUniversidade;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    private String situacao;
    private List<Observador> observadores = new ArrayList<Observador>();

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
        if ("Formado".equalsIgnoreCase(situacao)) {
            notificarTodos();
        }
    }

    public void adicionar(Observador o) {
        observadores.add(o);
    }

    public void remover(Observador o) {
        observadores.remove(o);
    }

    public void notificarTodos() {
        for (Observador o : observadores) {
            o.processar();
        }
    }

}
