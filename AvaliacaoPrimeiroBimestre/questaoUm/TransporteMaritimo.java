package questaoUm;

/*
Implementa o cálculo de frete marítimo baseado em peso ou volume. Parte do Strategy,
 respeitando regras específicas.
*/

public class TransporteMaritimo implements iEstrategiaFrete {
    private final double valorPorM3;
    private final double valorPorKg;
    private final double taxaBase;

    public TransporteMaritimo(double valorPorM3, double valorPorKg, double taxaBase) {
        this.valorPorM3 = valorPorM3;
        this.valorPorKg = valorPorKg;
        this.taxaBase = taxaBase;
    }

    @Override
    public double calcular(double distanciaKm, double pesoKg, double volumeM3) {
        double porVolume = valorPorM3 * volumeM3;
        double porPeso = valorPorKg * pesoKg;
        return taxaBase + Math.max(porVolume, porPeso);
    }
}
