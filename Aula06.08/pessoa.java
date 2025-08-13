public class pessoa {
    public String cpf;
    public String nome;
    public String email;
    public String telefone;

    public boolean salvar() {
        if (this.cpf.equals("888")) {
            return false;
        }
        return true;
    }

}