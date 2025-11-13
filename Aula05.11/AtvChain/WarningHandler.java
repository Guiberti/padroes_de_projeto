package AtvChain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WarningHandler extends AbstractLogHandler {
    private static final String NIVEL = "WARNING";
    private static final String NOME_ARQUIVO = "warnings.txt";

    @Override
    protected boolean canHandle(String nivel) {
        return NIVEL.equals(nivel);
    }

    @Override
    protected void handle(LogMessage log) {
        try (FileWriter fw = new FileWriter(NOME_ARQUIVO, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(log.toString());
            System.out.println("!!! WARNING (Arquivo): Log escrito em " + NOME_ARQUIVO);

        } catch (IOException e) {
            System.err.println("Erro ao escrever log WARNING no arquivo: " + e.getMessage());
        }
    }
}