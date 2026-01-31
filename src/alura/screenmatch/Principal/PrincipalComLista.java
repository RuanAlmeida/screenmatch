package alura.screenmatch.Principal;

import alura.screenmatch.modelos.Filme;
import alura.screenmatch.modelos.Serie;
import alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meufilme = new Filme("O poderoso Chefão", 1970);
        meufilme.avalia(8);
        Serie minhaSerie = new Serie("Lost", 2000);
        minhaSerie.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meufilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);


        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            }


        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Michael B. Jordan");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Com COLLECTIONS:");
        System.out.println(buscaPorArtista);



        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("lista ordenada por ano de lançamento: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
