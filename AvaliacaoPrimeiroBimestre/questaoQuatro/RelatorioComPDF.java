package questaoQuatro;

/*Decorator que adiciona exportação em PDF,
mostrando a extensão progressiva de funcionalidades sem alterar o relatório básico.*/

public class RelatorioComPDF extends RelatorioDecorator {

    public RelatorioComPDF(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Exportado para PDF: relatorio.pdf");
    }
}
