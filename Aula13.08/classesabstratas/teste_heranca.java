package classesabstratas;

public class teste_heranca {

    public static void main(String[] args) {
        //estudante estudante = new estudante();
        //estudante.cpf = "888";
        //estudante.Salvar();

        professor prof = new professor();
        prof.cpf = "111";

        estudante estudante = new estudante();
        estudante.cpf = "222";

        faculdade up = new faculdade();
        up.processar(estudante);

        faculdade ip = new faculdade();
        ip.processar(prof);

    }
}