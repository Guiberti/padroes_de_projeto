package batalha;

import personagens.Personagem;
import java.util.List;

public class Batalha {

    public void iniciar(List<Personagem> timeA, List<Personagem> timeB) {
        System.out.println("==== INÍCIO DA BATALHA ====");
        int turno = 1;

        while (algumVivo(timeA) && algumVivo(timeB)) {
            System.out.println("\\n--- TURNO " + turno + " ---");
            executarTurno(timeA, timeB);
            executarTurno(timeB, timeA);
            turno++;
        }

        System.out.println("\\n==== FIM DA BATALHA ====");
        System.out.println(algumVivo(timeA) ? "Vitória do Time A!" : "Vitória do Time B!");
    }

    private void executarTurno(List<Personagem> atacantes, List<Personagem> defensores) {
        for (Personagem atacante : atacantes) {
            if (atacante.estaVivo()) {
                Personagem alvo = defensores.stream().filter(Personagem::estaVivo).findFirst().orElse(null);
                if (alvo == null) return;
                atacante.atacar(alvo);
            }
        }
    }

    private boolean algumVivo(List<Personagem> time) {
        return time.stream().anyMatch(Personagem::estaVivo);
    }
}
