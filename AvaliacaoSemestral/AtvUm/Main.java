package AtvUm;

public class Main {
    public static void main(String[] args) {

        RelatorioCreator creator = new RelatorioDiarioCreator();
        Relatorio diario = creator.criarRelatorio();
        diario.gerar();

        System.out.println("=============");

        creator = new RelatorioSemanalCreator();
        Relatorio semanal = creator.criarRelatorio();
        semanal.gerar();

        System.out.println("=============");

        creator = new RelatorioEmergencialCreator();
        Relatorio emergencial = creator.criarRelatorio();
        emergencial.gerar();

        System.out.println("=============");
    }
}
