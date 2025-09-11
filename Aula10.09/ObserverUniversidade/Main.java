package ObserverUniversidade;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        new DiplomaConcreto(estudante);
        new ColacaoGrauConcreto(estudante);

        System.out.println("Mudando situação do estudante para Formado...");
        estudante.setSituacao("Formado");

    }
}
