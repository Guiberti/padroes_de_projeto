package questaoUm;

/**
 * Calculadora de Frete
 *
 * Delegador do cálculo de frete para uma estratégia.
 * Justificativa do padrão:
 * - Strategy: permite definir a regra de cálculo em tempo de execução.
 * - O cliente não precisa mudar para calcular frete terrestre, aéreo ou marítimo.
 */

public class CalculadoraFrete {
    private iEstrategiaFrete estrategia;

    public CalculadoraFrete(iEstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(iEstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double distanciaKm, double pesoKg, double volumeM3) {
        return estrategia.calcular(distanciaKm, pesoKg, volumeM3);
    }
}
