package questaoQuatro;

/*Demonstra a composição dos decorators, mostrando como construir
relatórios progressivamente com estatísticas, gráficos e PDF.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        iRelatorio relatorioBasico = new RelatorioBasico(
                Arrays.asList("Pedido 1", "Pedido 2", "Pedido 3")
        );

        System.out.println("=== Relatório Básico ===");
        relatorioBasico.gerar();

        System.out.println("\n=== Relatório com Estatísticas ===");
        iRelatorio relatorioEstat = new RelatorioComEstatisticas(relatorioBasico);
        relatorioEstat.gerar();

        System.out.println("\n=== Relatório com Estatísticas + Gráfico ===");
        iRelatorio relatorioGrafico = new RelatorioComGrafico(relatorioEstat);
        relatorioGrafico.gerar();

        System.out.println("\n=== Relatório Completo com PDF ===");
        iRelatorio relatorioPDF = new RelatorioComPDF(relatorioGrafico);
        relatorioPDF.gerar();
    }
}
