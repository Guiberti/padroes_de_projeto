package questaoTres;

/**
 * Singleton: Gerenciador de Notícias
 *
 * Mantém controle centralizado dos tópicos e assinaturas.
 * Justificativa do padrão:
 * - Singleton: ponto único de gerenciamento de tópicos.
 * - Observer: integrado nos tópicos, notificando leitores automaticamente.
 */

import java.util.HashMap;
import java.util.Map;

public class GerenciadorNoticias {

    private static GerenciadorNoticias instancia;
    private Map<String, Topico> topicos = new HashMap<>();

    private GerenciadorNoticias() {
    }

    public static GerenciadorNoticias getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorNoticias();
        }
        return instancia;
    }

    public Topico criarTopico(String nome) {
        Topico t = new Topico(nome);
        topicos.put(nome, t);
        return t;
    }

    public Topico getTopico(String nome) {
        return topicos.get(nome);
    }
}
