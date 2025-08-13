public class professor extends pessoa {
    public String matricula;
    public String titulacao;

    @Override
    public boolean salvar() {
        if (super.salvar()) {
            System.out.println("Salvando na tabela de professores");
            return true;
        }
        return false;
    }


    }
}
