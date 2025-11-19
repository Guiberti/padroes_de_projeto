package AtvDois;

public class AnaliseRisco {
    private CalculoRisco estrategia;

    public void setEstrategia(CalculoRisco estrategia) {
        this.estrategia = estrategia;
    }

    public double executarCalculo(double renda, double investimentos) {
        return estrategia.calcular(renda, investimentos);
    }
}
