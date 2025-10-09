package questaoUm;

/**
 * FabricaTransporte (Factory leve)
 *
 * Cria instâncias de diferentes modalidades de transporte sem acoplar o cliente às classes concretas.
 * Justificativa do padrão:
 * - Isola a criação de objetos.
 * - Facilita manutenção e extensão do sistema.
 */

public class FabricaTransporte {

    public enum Modalidade {TERRESTRE, AEREO, MARITIMO}

    public static iEstrategiaFrete criar(Modalidade m) {
        switch (m) {
            case TERRESTRE:
                return new TransporteTerrestre(0.50, 20);
            case AEREO:
                return new TransporteAereo(10, 50);
            case MARITIMO:
                return new TransporteMaritimo(30, 2, 40);
            default:
                throw new IllegalArgumentException("Modalidade inválida");
        }
    }
}
