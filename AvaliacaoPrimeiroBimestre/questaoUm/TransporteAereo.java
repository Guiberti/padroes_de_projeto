package questaoUm;

/*Implementa o cálculo de frete aéreo baseado em peso da carga. Parte do Strategy,
 garantindo que mudanças na regra de cálculo não afetem o cliente.*/

public class TransporteAereo implements iEstrategiaFrete {
    private final double valorPorKg;
    private final double minimoCobrado;

    public TransporteAereo(double valorPorKg, double minimoCobrado) {
        this.valorPorKg = valorPorKg;
        this.minimoCobrado = minimoCobrado;
    }

    @Override
    public double calcular(double distanciaKm, double pesoKg, double volumeM3) {
        double carga = valorPorKg * pesoKg;
        return Math.max(carga, minimoCobrado);
    }
}
