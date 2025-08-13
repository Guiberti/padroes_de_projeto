public class teste_heranca {

        public static void main(String[] args) {
            System.out.println("Parte Professor");
        professor prof = new professor();
        prof.cpf = "888";
        prof.telefone = "41998520147";
        prof.matricula = "123456";
        System.out.println(prof.salvar());

        System.out.println("Parte Estudante");
        estudante e1 = new estudante();
        e1.cpf = "888";
        System.out.println(e1.salvar());

        processador processador = new processador();
        processador.processar(prof);

        // processador processadorEstudante = new processador();
        // processadorEstudante.processar(e1);
        }

        
    }
