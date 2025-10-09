package questaoUm;

/*Demonstra o uso do Strategy e Factory. Mostra como a calculadora de frete pode usar diferentes
modalidades sem alterar o código.*/

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calc;

        calc = new CalculadoraFrete(FabricaTransporte.criar(FabricaTransporte.Modalidade.TERRESTRE));
        System.out.printf("Frete Terrestre (200km): R$ %.2f%n", calc.calcular(200, 0, 0));

        calc.setEstrategia(FabricaTransporte.criar(FabricaTransporte.Modalidade.AEREO));
        System.out.printf("Frete Aéreo (12kg): R$ %.2f%n", calc.calcular(0, 12, 0));

        calc.setEstrategia(FabricaTransporte.criar(FabricaTransporte.Modalidade.MARITIMO));
        System.out.printf("Frete Marítimo (500kg, 2.5m3): R$ %.2f%n", calc.calcular(0, 500, 2.5));
    }
}
