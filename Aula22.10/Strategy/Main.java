package Strategy;

public class Main {
    public static void main(String[] args) {

        //Constrói o contexto com uma estratégia inicial
        CriadorRotas maps = new CriadorRotas(new Auto());

        //Executa a estratégia
        System.out.println(maps.executar());

        //Alternativa para trocar a estratégia
        maps.setEstrategia(new Aviao());

        //Executa a estratégia
        System.out.println(maps.executar());

    }
}
