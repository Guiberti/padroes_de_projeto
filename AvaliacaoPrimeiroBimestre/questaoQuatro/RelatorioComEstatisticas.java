package questaoQuatro;

/**
 * Adiciona estatísticas ao relatório.
 *
 * Justificativa do padrão:
 * - Decorator: permite empilhar funcionalidades sobre o RelatorioBasico.
 */

public class RelatorioComEstatisticas extends RelatorioDecorator {

    public RelatorioComEstatisticas(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Estatísticas: Total de pedidos = 10, Faturamento = R$ 5000,00");
    }
}
