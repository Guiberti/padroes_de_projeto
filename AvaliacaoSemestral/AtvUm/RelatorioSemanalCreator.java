package AtvUm;

public class RelatorioSemanalCreator extends RelatorioCreator {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }

}
