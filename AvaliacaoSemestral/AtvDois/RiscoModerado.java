package AtvDois;

public class RiscoModerado implements CalculoRisco{
    @Override
    public double calcular(double renda, double investimentos) {
        return (investimentos * 0.5) / renda;
    }
}
