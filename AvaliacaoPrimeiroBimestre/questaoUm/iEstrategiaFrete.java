package questaoUm;

/**
 * Interface EstrategiaFrete (Strategy)
 *
 * Define o contrato de cálculo de frete para diferentes modalidades.
 * Justificativa do padrão:
 * - Permite que cada tipo de transporte (terrestre, aéreo, marítimo) tenha sua própria implementação do cálculo.
 * - O código cliente (CalculadoraFrete) não precisa saber detalhes das regras de cada transporte.
 */

public interface iEstrategiaFrete {
    double calcular(double distanciaKm, double pesoKg, double volumeM3);
}
