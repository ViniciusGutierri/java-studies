public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Pontes Indestrutíveis";
        musica.artista = "Charlie Brown Jr.";
        musica.anoLancamento = 2007;

        musica.avalia(10);
        musica.avalia(7);
        musica.avalia(8);
        musica.avalia(8.7);

        musica.exibeFichaTecnica();
        System.out.println("\n\nSoma das avaliações: " + musica.avaliacao);
        System.out.println("Total de avaliações: " + musica.numAvaliacoes);
        System.out.println("Média das avaliações: " + musica.mediaAvaliacoes());
    }
}