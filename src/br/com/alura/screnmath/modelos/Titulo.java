package br.com.alura.screnmath.modelos;

public class Titulo implements  Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // classe mae
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano (boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAvaliacao (int avaliacao){
        this.avaliacao = avaliacao;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
