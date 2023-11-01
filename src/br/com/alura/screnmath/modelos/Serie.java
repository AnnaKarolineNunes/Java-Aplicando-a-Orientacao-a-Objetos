package br.com.alura.screnmath.modelos;

import br.com.alura.screnmath.modelos.Titulo;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPortemporada;
    private int minutosporEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPortemporada(){
        return episodiosPortemporada;
    }

    public void setEpisodiosPortemporada(int episodiosPortemporada){
        this.episodiosPortemporada = episodiosPortemporada;
    }

    public int getMinutosporEpisodio(){
        return minutosporEpisodio;
    }

    public void setMinutosporEpisodio(int minutosporEpisodio){
        this.minutosporEpisodio = minutosporEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPortemporada * minutosporEpisodio;
    }

    public String toString(){
        return  "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
