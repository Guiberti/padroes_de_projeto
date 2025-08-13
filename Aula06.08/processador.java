public class processador {
    public void processar (professor p) {
        System.out.println("Salvando CPF PROFESSOR " + p.cpf);
        p.salvar();
    }

    public void processar (estudante e) {
        System.out.println("Salvando CPF ESTUDANTE " + e.cpf);
        e.salvar();
    }
}
