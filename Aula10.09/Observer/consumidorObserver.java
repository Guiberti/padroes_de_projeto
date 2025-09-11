package Observer;

public class consumidorObserver {

    public static void main(String[] args) {
        observado interesse = new observado();
        observadorConcreto observador1 = new observadorConcreto(interesse);
        observadorConcreto observador2 = new observadorConcreto(interesse);

        interesse.setEstado(10);

    }

}
