package AtvChain;

public class ErrorHandler extends AbstractLogHandler {
    private static final String NIVEL = "ERROR";

    @Override
    protected boolean canHandle(String nivel) {
        return NIVEL.equals(nivel);
    }

    @Override
    protected void handle(LogMessage log) {
        System.out.println("*** ERROR (E-mail): Notificação enviada. Assunto: Erro Crítico. Mensagem: " + log.getMensagem());
    }
}