package AtvUm;

public class RelatorioDiarioCreator extends RelatorioCreator {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}
