package questaoTres;

/*Implementa o Observer, recebendo notificações dos tópicos aos quais está inscrito.*/

public class LeitorConcreto implements iLeitor {

    private String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String topico, String noticia) {
        System.out.printf("%s recebeu notificação do tópico '%s': %s%n", nome, topico, noticia);
    }
}
