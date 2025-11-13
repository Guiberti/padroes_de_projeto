package AtvChain;

public class DebugHandler extends AbstractLogHandler {
    private static final String NIVEL = "DEBUG";

    @Override
    protected boolean canHandle(String nivel) {
        return NIVEL.equals(nivel);
    }

    @Override
    protected void handle(LogMessage log) {
        System.out.println(">>> DEBUG (Console): " + log.toString());
    }
}