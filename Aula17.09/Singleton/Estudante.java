public class Estudante {
    private static Estudante instancia; //persiste a instancia depois de construida
    private String nome;
    private String disciplina;
    private Double nota;

    //contrutor privado
    private Estudante(String nome, String disciplina, Double nota) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public static Estudante getInstance(String nome, String disciplina, Double nota) {
        if(instancia == null) {
            instancia = new Estudante(nome, disciplina, nota);
        }
        return instancia;
    }

    public static Estudante DestruirEstudante() {
        if (instancia != null) {
            instancia = null;
        }
        return instancia;
    }

    public Estudante getInstancia() {
        return instancia;
    }

    public void setInstancia(Estudante instancia) {
        this.instancia = instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
