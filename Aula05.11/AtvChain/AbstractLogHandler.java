package AtvChain;

public abstract class AbstractLogHandler {
    protected AbstractLogHandler nextHandler;

    public void setNextHandler(AbstractLogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void processar(LogMessage log) {
        if (canHandle(log.getNivel())) {
            handle(log); // Chama o método concreto de processamento
        }
        else if (nextHandler != null) {
            nextHandler.processar(log);
        }
    }

    protected abstract void handle(LogMessage log);

    protected abstract boolean canHandle(String nivel);
}
