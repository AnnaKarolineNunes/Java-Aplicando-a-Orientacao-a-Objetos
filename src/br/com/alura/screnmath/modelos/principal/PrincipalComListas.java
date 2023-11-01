package br.com.alura.screnmath.modelos.principal;

import br.com.alura.screnmath.modelos.Filme;
import br.com.alura.screnmath.modelos.Serie;
import br.com.alura.screnmath.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefao",1980);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme( "Avatar", 2023);
        outroFilme.avalia(10);
        Filme filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(3);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista= new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificaçao" + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois da ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordedando por ano");
        System.out.println(lista);
    }
}
