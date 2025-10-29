package main;

import batalha.Batalha;
import personagens.*;
import estrategia.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Personagem> timeA = Arrays.asList(
                new Guerreiro("Arthur", new EspadaLonga()),
                new Arqueiro("Legolas", new ArcoElfico())
        );

        List<Personagem> timeB = Arrays.asList(
                new Mago("Merlin", new CajadoArcano()),
                new Guerreiro("Ragnar", new MachadoDeGuerra()),
                new Arqueiro("Sylvanas", new AdagaSombria())
        );

        Batalha batalha = new Batalha();
        batalha.iniciar(timeA, timeB);
    }
}
