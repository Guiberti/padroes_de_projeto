package AtvUm;

public class RelatorioEmergencialCreator extends RelatorioCreator{
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}
