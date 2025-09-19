public class ConsumidorEstudante {

    public static void main(String[] args) {
        Estudante aluno = Estudante.getInstance(
                "Guilherme Berti",
                "Padrões de Projeto",
                5.0);

        System.out.println(aluno.getNome() + " " +
                aluno.getDisciplina() + " " +
                aluno.getNota());

        Estudante.DestruirEstudante();

        Estudante aluno2 = Estudante.getInstance("Pedro", "Arquitetura de Software", 8.0);

        System.out.println(aluno2.getNome() + " " +
                aluno2.getDisciplina() + " " +
                aluno2.getNota());
    }
}
