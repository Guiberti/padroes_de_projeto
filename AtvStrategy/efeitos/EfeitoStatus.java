package efeitos;

public interface EfeitoStatus {
    void aplicar(String alvo);
    String obterNome();
}