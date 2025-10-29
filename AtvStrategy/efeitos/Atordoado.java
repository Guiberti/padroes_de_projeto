package efeitos;

public class Atordoado implements EfeitoStatus {

    @Override
    public void aplicar(String alvo) {
        System.out.println(alvo + " foi atordoado e perderá o próximo turno!");
    }

    @Override
    public String obterNome() {
        return "Atordoado";
    }
}
