package AtvState;

public class Main {
    public static void main(String[] args) {
        Order pedido1 = new Order();
        System.out.println("Estado atual: " + pedido1.getEstadoNome());
        System.out.println("---");

        // 2. Tentar Enviar (Inválido)
        pedido1.enviar(); // Deve dar erro, pois precisa pagar antes.
        System.out.println("Estado atual: " + pedido1.getEstadoNome());
        System.out.println("---");

        // 3. Pagar (Transição: Novo -> Pago)
        pedido1.pagar();
        System.out.println("Estado atual: " + pedido1.getEstadoNome());
        System.out.println("---");

        // 4. Enviar (Transição: Pago -> Enviado)
        pedido1.enviar();
        System.out.println("Estado atual: " + pedido1.getEstadoNome());
        System.out.println("---");

        // 5. Tentar Cancelar (Inválido)
        pedido1.cancelar(); // Deve dar erro, pois foi enviado.
        System.out.println("Estado atual: " + pedido1.getEstadoNome());
        System.out.println("---");

        // 6. Entregar (Transição: Enviado -> Entregue)
        pedido1.entregar();
        System.out.println("Estado final: " + pedido1.getEstadoNome());
    }
}
