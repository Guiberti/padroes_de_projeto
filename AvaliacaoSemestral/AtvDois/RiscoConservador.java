package AtvDois;

public class RiscoConservador implements CalculoRisco{
    @Override
    public double calcular(double renda, double investimentos) {
        return (investimentos * 0.2) / renda;
    }
}
