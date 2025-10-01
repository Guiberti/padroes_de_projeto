package Decorator;

//Decorador abstrato

public abstract class CondimentDecorador implements iBebida {

    protected iBebida bebida;

    public CondimentDecorador(iBebida bebida) {
        this.bebida = bebida;
    }
}
