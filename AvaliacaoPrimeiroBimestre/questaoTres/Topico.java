package questaoTres;

/**
 * Topico (Subject do Observer)
 *
 * Notifica automaticamente os leitores inscritos quando uma notícia é publicada.
 * Justificativa do padrão:
 * - Observer: desacopla o emissor de notícias (tópico) dos leitores.
 * - Permite múltiplos leitores e múltiplos tópicos sem manter listas manuais fora da classe.
 */

import java.util.ArrayList;
import java.util.List;

public class Topico {

    private String nome;
    private List<iLeitor> leitores = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inscrever(iLeitor leitor) {
        leitores.add(leitor);
    }

    public void remover(iLeitor leitor) {
        leitores.remove(leitor);
    }

    public void publicarNoticia(String noticia) {
        System.out.printf("Nova notícia no tópico '%s': %s%n", nome, noticia);
        for (iLeitor leitor : leitores) {
            leitor.atualizar(nome, noticia);
        }
    }
}
