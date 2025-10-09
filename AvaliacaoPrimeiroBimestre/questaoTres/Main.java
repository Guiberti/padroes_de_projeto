package questaoTres;

/*Demonstra o uso do Observer + Singleton,
mostrando leitores sendo notificados automaticamente ao publicar notícias.*/

public class Main {
    public static void main(String[] args) {
        GerenciadorNoticias gerente = GerenciadorNoticias.getInstancia();

        Topico politica = gerente.criarTopico("Política");
        Topico esportes = gerente.criarTopico("Esportes");
        Topico tecnologia = gerente.criarTopico("Tecnologia");

        iLeitor leitor1 = new LeitorConcreto("Alice");
        iLeitor leitor2 = new LeitorConcreto("Bob");
        iLeitor leitor3 = new LeitorConcreto("Carol");

        politica.inscrever(leitor1);
        esportes.inscrever(leitor2);
        tecnologia.inscrever(leitor1);
        tecnologia.inscrever(leitor3);

        politica.publicarNoticia("Nova lei aprovada no congresso.");
        esportes.publicarNoticia("Time local conquista campeonato.");
        tecnologia.publicarNoticia("Lançamento de novo smartphone.");
    }
}
