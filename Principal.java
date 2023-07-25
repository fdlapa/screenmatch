package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelo.Filme;
import br.com.screenmatch.modelo.Serie;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome ("Poderoso Chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("Martin Scorcese");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        //lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
      //  lost.setDuracaoEmMinutos(220);
      //  lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodios(50);
       // System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome ("Matrix");
        outroFilme.setAnoDeLancamento(1999);
        outroFilme.setDuracaoEmMinutos(210);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDiretor("Diretor fulano");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       // calculadora.inclui(meuFilme);
      //  calculadora.inclui(outroFilme);
        System.out.println("tempo total: " + calculadora.getTempoTotal());
    }
}
