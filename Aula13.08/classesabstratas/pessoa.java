package classesabstratas;

public abstract class pessoa {

    public String cpf;
    public String nome;

    public boolean Salvar() {
        if (this.cpf.equals("888")) {
            return false;
        }
        return true;
    }

}