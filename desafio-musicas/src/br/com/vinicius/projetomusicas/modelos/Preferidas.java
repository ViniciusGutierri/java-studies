package br.com.vinicius.projetomusicas.modelos;

public class Preferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.printf("\n\"%s\" é considerado o maior sucesso!", audio.getTitulo());
        } else {
            System.out.printf("\n\"%s\" todos também estão curtindo!", audio.getTitulo());
        }
    }
}
