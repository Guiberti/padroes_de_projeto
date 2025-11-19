package AtvUm;

public abstract class Relatorio {

    public abstract void prepararDados();
    public abstract void formatar();

    public void gerar() {
        prepararDados();
        formatar();
        System.out.println("Relatório gerado com sucesso");
    }
}
