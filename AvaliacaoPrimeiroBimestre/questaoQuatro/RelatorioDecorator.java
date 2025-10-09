package questaoQuatro;

/**
 * Decorator abstrato para Relatórios
 *
 * Permite adicionar funcionalidades extras aos relatórios sem modificar o código do RelatorioBasico.
 * Justificativa do padrão:
 * - Decorator: adiciona comportamento adicional (estatísticas, gráficos, PDF) de forma flexível e extensível.
 * - Mantém o princípio aberto/fechado: classes existentes não são alteradas.
 */

public abstract class RelatorioDecorator implements iRelatorio {

    protected iRelatorio relatorio;

    public RelatorioDecorator(iRelatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void gerar() {
        relatorio.gerar();
    }
}
