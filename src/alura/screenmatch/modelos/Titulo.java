package alura.sreenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getAvaliacoes() {
        return (somaDasAvaliacoes / totalDeAvaliacoes);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void exibeFichaTecnica (){
        System.out.println(String.format("""
                nome do filme: %s
                ano de lançamento: %d
                """, nome, anoDeLancamento));
    }

    /*public double getMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
     */
    public void getMediaAvaliacoes(){
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Media de avaliações: " + somaDasAvaliacoes / totalDeAvaliacoes);
    }
}
