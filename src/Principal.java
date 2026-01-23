import alura.screenmatch.modelos.Episodio;
import alura.screenmatch.modelos.Filme;
import alura.screenmatch.modelos.Serie;
import alura.screenmatch.calculadora.CalculadoraDeTempo;
import alura.screenmatch.calculadora.filtroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.setNome("O Poderoso Chefão");
        meufilme.setAnoDeLancamento(1970);
        meufilme.setDuracaoEmMinutos(180);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(10);
        meufilme.avalia(9);
        meufilme.avalia(8);
        meufilme.avalia(9);
        meufilme.avalia(4);
        meufilme.avalia(7);
        meufilme.avalia(6);
        meufilme.avalia(9);
        meufilme.avalia(6);

        meufilme.pegaMedia();


        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setDuracaoEmMinutos(5000);
        minhaSerie.setAtiva(true);
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemp(10);
        minhaSerie.setMinPorEpisodio(50);

        System.out.println(minhaSerie.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(minhaSerie);

        System.out.println(calculadora.getTempoTotal());

        filtroRecomendacao filtro = new filtroRecomendacao();
        filtro.filtra(meufilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


         var filmeDoPaulo = new Filme();
         filmeDoPaulo.setNome("Dogville");
         filmeDoPaulo.setDuracaoEmMinutos(200);
         filmeDoPaulo.setAnoDeLancamento(2003);
         filmeDoPaulo.avalia(10);

         ArrayList<Filme> listaDeFilmes = new ArrayList<>();
         listaDeFilmes.add(filmeDoPaulo);
         listaDeFilmes.add(meufilme);
         listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());

    }
}
