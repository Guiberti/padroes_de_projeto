package Strategy;

public class Auto implements iCriadorRotas {

    @Override
    public String criarRota() {
        //Algoritmo específico da estratégia Auto
        return "Rota criada para automóveis";
    }
}
