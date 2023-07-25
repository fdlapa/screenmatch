package br.com.screenmatch.modelo;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private Boolean incluidoNoPlano;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Serie está ativa: " );
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes ;
    }
    public String getNome() {
        return this.nome;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public Boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes() {
        return this.somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(Boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
private String diretor;
    public String getDiretor() {
        return this.diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
