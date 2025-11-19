package AtvDois;

public class Main {
    public static void main(String[] args) {
        AnaliseRisco analise = new AnaliseRisco();

        analise.setEstrategia(new RiscoAgressivo());
        System.out.println("Risco Agressivo: " + analise.executarCalculo(2000, 50000));

        System.out.println("==========");

        analise.setEstrategia(new RiscoModerado());
        System.out.println("Risco Moderado: " + analise.executarCalculo(2000, 50000));

        System.out.println("==========");

        analise.setEstrategia(new RiscoConservador());
        System.out.println("Risco Conservador: " + analise.executarCalculo(2000, 50000));
    }
}
