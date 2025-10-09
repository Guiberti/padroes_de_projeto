package questaoUm;

/**
 * TransporteTerrestre (Strategy)
 *
 * Calcula frete baseado na distância percorrida.
 * Justificativa do padrão:
 * - Implementa a interface EstrategiaFrete.
 * - Permite trocar dinamicamente a estratégia de cálculo, seguindo o padrão Strategy.
 */

public class TransporteTerrestre implements iEstrategiaFrete {
    private final double valorPorKm;
    private final double taxaBase;

    public TransporteTerrestre(double valorPorKm, double taxaBase) {
        this.valorPorKm = valorPorKm;
        this.taxaBase = taxaBase;
    }

    @Override
    public double calcular(double distanciaKm, double pesoKg, double volumeM3) {
        return taxaBase + valorPorKm * distanciaKm;
    }
}
