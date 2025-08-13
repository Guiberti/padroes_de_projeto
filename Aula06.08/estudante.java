public class estudante extends pessoa {
    public String rgm;

    @Override
    public boolean salvar() {
        if (super.salvar()) {
            System.out.println("Salvando na tabela de estudantes");
            return true;
        }
        return false;
    }
}
