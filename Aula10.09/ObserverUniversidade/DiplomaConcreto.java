package ObserverUniversidade;

public class DiplomaConcreto extends Observador {

    public DiplomaConcreto(Estudante estudante) {
        this.estudante = estudante;
        this.estudante.adicionar(this);
    }

    @Override
    void processar() {
        System.out.println("Diploma registrado para o estudante!");
    }
}
