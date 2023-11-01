package br.com.alura.screnmath.modelos.calculos;

import br.com.alura.screnmath.modelos.Filme;
import br.com.alura.screnmath.modelos.Serie;
import br.com.alura.screnmath.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui (Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duraçao em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
