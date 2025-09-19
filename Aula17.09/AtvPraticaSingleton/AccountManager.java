import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private static AccountManager instance;
    private Map<String, Double> contas;

    private AccountManager() {
        contas = new HashMap<>();
    }

    public static synchronized AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public void criarConta(String contaId, double saldoInicial) {
        if (!contas.containsKey(contaId)) {
            contas.put(contaId, saldoInicial);
            System.out.println("Conta criada: " + contaId + " com saldo inicial: " + saldoInicial);
        } else {
            System.out.println("Conta já existe: " + contaId);
        }
    }

    public void depositar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldoAtual = contas.get(contaId);
            contas.put(contaId, saldoAtual + valor);
            System.out.println("Depósito de " + valor + " realizado na conta " + contaId);
        } else {
            System.out.println("Conta não encontrada: " + contaId);
        }
    }

    public void sacar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldoAtual = contas.get(contaId);
            if (saldoAtual >= valor) {
                contas.put(contaId, saldoAtual - valor);
                System.out.println("Saque de " + valor + " realizado na conta " + contaId);
            } else {
                System.out.println("Saldo insuficiente na conta " + contaId);
            }
        } else {
            System.out.println("Conta não encontrada: " + contaId);
        }
    }

    public void verSaldo(String contaId) {
        if (contas.containsKey(contaId)) {
            System.out.println("Saldo da conta " + contaId + ": " + contas.get(contaId));
        } else {
            System.out.println("Conta não encontrada: " + contaId);
        }
    }

    public void listarContasAtivas() {
        System.out.println("Contas ativas:");
        for (String contaId : contas.keySet()) {
            System.out.println("Conta: " + contaId + ", Saldo: " + contas.get(contaId));
        }
    }
}
