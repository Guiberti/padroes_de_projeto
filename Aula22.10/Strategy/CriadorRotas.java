package Strategy;

public class CriadorRotas {
    //O contexto requer injeção de dependências
    private iCriadorRotas estrategia;

    //Construtor

    public CriadorRotas(iCriadorRotas estrategia) {
        this.estrategia = estrategia;
    }

    //Método para trocar de estratégia em tempo de execução
    public void setEstrategia(iCriadorRotas novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    //Método que eecuta o algoritmo da estratégia
    public String executar() {
        return this.estrategia.criarRota(); /* O método criarRota é assinado pela
         interface da estratégia e implementado na estratégia concreta */
    }
}
