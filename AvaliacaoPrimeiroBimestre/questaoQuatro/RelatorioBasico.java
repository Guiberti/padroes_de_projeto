package questaoQuatro;
/*Implementação básica do relatório, lista apenas os pedidos.
Permanece imutável, podendo ser estendido via Decorator.*/

import java.util.List;

public class RelatorioBasico implements iRelatorio {

    private List<String> pedidos;

    public RelatorioBasico(List<String> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void gerar() {
        System.out.println("Relatório Básico de Pedidos:");
        for (String pedido : pedidos) {
            System.out.println("- " + pedido);
        }
    }
}
