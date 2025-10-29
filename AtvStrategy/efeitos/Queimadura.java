package efeitos;

public class Queimadura implements EfeitoStatus {

    @Override
    public void aplicar(String alvo) {
        System.out.println(alvo + " está queimando em chamas! (-10 de HP por turno)");
    }

    @Override
    public String obterNome() {
        return "Queimadura";
    }
}