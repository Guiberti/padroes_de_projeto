package AtvDois;

public class RiscoAgressivo implements CalculoRisco{
    @Override
    public double calcular(double renda, double investimentos) {
        return (investimentos * 0.8) / renda;
    }
}
