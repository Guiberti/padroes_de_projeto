package questaoQuatro;

/*Decorator que adiciona gráficos ao relatório,
 demonstrando a possibilidade de composição dinâmica de funcionalidades.*/

public class RelatorioComGrafico extends RelatorioDecorator {

    public RelatorioComGrafico(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Gráficos: [Simulação de gráfico de vendas]");
    }
}
