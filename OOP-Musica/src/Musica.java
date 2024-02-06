public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.printf("Titulo: %s", titulo);
        System.out.printf("\nArtista: %s", artista);
        System.out.printf("\nAno de lançamento: %d", anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}
