package Decorator;

//Decorador concreto

public class LeiteDecorador extends CondimentDecorador {

    public LeiteDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + " + Leite";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 0.5;
    }
}
