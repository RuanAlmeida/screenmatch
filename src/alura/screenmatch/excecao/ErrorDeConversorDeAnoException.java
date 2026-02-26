package alura.screenmatch.excecao;

public class ErrorDeConversorDeAnoException extends RuntimeException {

    private String mensagem;

    public ErrorDeConversorDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
