public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("001", "Alice");
        Cliente cliente2 = new Cliente("002", "Bob");

        System.out.println("------------");

        cliente1.depositar(1000);
        cliente2.depositar(500);

        System.out.println("------------");

        cliente1.verSaldo();
        cliente2.verSaldo();

        System.out.println("------------");

        cliente1.sacar(200);
        cliente1.verSaldo();

        System.out.println("------------");

        cliente2.sacar(600);

        System.out.println("------------");

        AccountManager.getInstance().listarContasAtivas();

        System.out.println("------------");

        AccountManager am1 = AccountManager.getInstance();
        AccountManager am2 = AccountManager.getInstance();

        System.out.println("am1 == am2? " + (am1 == am2));

        System.out.println("------------");

        am2.verSaldo("001");
        am2.verSaldo("002");
    }
}