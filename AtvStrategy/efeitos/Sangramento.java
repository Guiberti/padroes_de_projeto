package efeitos;

public class Sangramento implements EfeitoStatus {

    @Override
    public void aplicar(String alvo) {
        System.out.println(alvo + " está sofrendo com sangramento! (-5 de HP por turno)");
    }

    @Override
    public String obterNome() {
        return "Sangramento";
    }
}
