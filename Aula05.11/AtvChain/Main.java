package AtvChain;

public class Main {
    public static void main(String[] args) {

        AbstractLogHandler debug = new DebugHandler();
        AbstractLogHandler info = new InfoHandler();
        AbstractLogHandler warning = new WarningHandler();
        AbstractLogHandler error = new ErrorHandler();

        debug.setNextHandler(info);
        info.setNextHandler(warning);
        warning.setNextHandler(error);

        System.out.println("======== INICIANDO PROCESSAMENTO DE LOGS ========");

        LogMessage log1 = new LogMessage("DEBUG", "Verificando variáveis de inicialização.");
        LogMessage log2 = new LogMessage("INFO", "Usuário 'admin' logado com sucesso.");
        LogMessage log3 = new LogMessage("WARNING", "O disco C: está com 90% de ocupação.");
        LogMessage log4 = new LogMessage("ERROR", "Conexão com o banco de dados falhou após 3 tentativas.");
        LogMessage log5 = new LogMessage("INFO", "Processo de backup concluído.");
        LogMessage log6 = new LogMessage("FATAL", "Este log será ignorado por não ter handler específico.");

        debug.processar(log1);
        debug.processar(log2);
        debug.processar(log3);
        debug.processar(log4);
        debug.processar(log5);
        debug.processar(log6);

        System.out.println("\n======== FIM DO PROCESSAMENTO ========");

        InfoHandler.visualizarLogsArmazenados();

    }
}