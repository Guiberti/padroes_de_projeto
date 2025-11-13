package AtvChain;

import java.util.ArrayList;
import java.util.List;

public class InfoHandler extends AbstractLogHandler {
    private static final String NIVEL = "INFO";
    private static final List<LogMessage> storedLogs = new ArrayList<>();

    @Override
    protected boolean canHandle(String nivel) {
        return NIVEL.equals(nivel);
    }

    @Override
    protected void handle(LogMessage log) {
        storedLogs.add(log);
        System.out.println("--- INFO (Lista): Log armazenado com sucesso.");
    }

    public static void visualizarLogsArmazenados() {
        System.out.println("\n--- Logs INFO Armazenados (Total: " + storedLogs.size() + ") ---");
        for (LogMessage log : storedLogs) {
            System.out.println(log.toString());
        }
        System.out.println("----------------------------------------\n");
    }
}
