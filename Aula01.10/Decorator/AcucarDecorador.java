package Decorator;

public class AcucarDecorador extends CondimentDecorador {

    public AcucarDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + " + Açucar";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 0.5;
    }
}