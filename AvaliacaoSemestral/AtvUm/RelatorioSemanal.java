package AtvUm;

public class RelatorioSemanal extends Relatorio{

    @Override
    public void prepararDados() {
        System.out.println("Coletando dados da semana...");
    }
    @Override
    public void formatar(){
        System.out.println("Formulando relatório semanal...");
    }
}
