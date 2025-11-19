package AtvUm;

public class RelatorioDiario extends Relatorio {

@Override
    public void prepararDados() {
    System.out.println("Coletando dados do dia...");
}
@Override
    public void formatar(){
    System.out.println("Formulando relatório diário...");
}
}
