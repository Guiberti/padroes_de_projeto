package CorrecaoSistemasPgtoMultiplataforma;

public class ServicePgto {
        public void pagar(AbsFabricaPgto fabricaPgto, double valor) {
            fabricaPgto.criar().pagar(valor);
        }
}
