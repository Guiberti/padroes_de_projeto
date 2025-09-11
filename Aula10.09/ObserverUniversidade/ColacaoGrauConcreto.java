package ObserverUniversidade;

public class ColacaoGrauConcreto extends Observador{

    public ColacaoGrauConcreto (Estudante estudante) {
        this.estudante = estudante;
        this.estudante.adicionar(this);
    }

    @Override
    void processar() {
        System.out.println("Agendamento de colação de grau realizado com sucesso");
    }
}
