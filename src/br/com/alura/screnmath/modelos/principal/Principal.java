package br.com.alura.screnmath.modelos.principal;

import br.com.alura.screnmath.modelos.Episodio;
import br.com.alura.screnmath.modelos.Filme;
import br.com.alura.screnmath.modelos.Serie;
import br.com.alura.screnmath.modelos.calculos.CalculadoraDeTempo;
import br.com.alura.screnmath.modelos.calculos.FiltroRecomendacao;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefao",1980);
        meuFilme.setAvaliacao(6);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Total de avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPortemporada(10);
        lost.setMinutosporEpisodio(180);
        System.out.println("Duraçao para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme( "A bela e a Fera", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(String.valueOf(lost));
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme>listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Primeiro filme" + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme" + listaDeFilmes.get(0).toString());



    }
}
