package AtvUm;

public class RelatorioEmergencial extends Relatorio{

    @Override
    public void prepararDados() {
        System.out.println("Coletando dados emergenciais...");
    }
    @Override
    public void formatar(){
        System.out.println("Formulando relatório emergencial...");
    }

}
