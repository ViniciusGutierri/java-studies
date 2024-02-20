package br.com.vinicius.projetomusicas.principal;

import br.com.vinicius.projetomusicas.modelos.Musica;
import br.com.vinicius.projetomusicas.modelos.Podcast;
import br.com.vinicius.projetomusicas.modelos.Preferidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Musica musica = new Musica();
        System.out.println("Titulo da música: ");
        musica.setTitulo(scanner.nextLine());
        System.out.printf("Cantor da música \"%s\": ", musica.getTitulo());
        musica.setCantor(scanner.nextLine());

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        System.out.println("\nNome do podcast: ");
        podcast.setTitulo(scanner.nextLine());
        System.out.printf("Host do podcast \"%s\": ", podcast.getTitulo());
        podcast.setHost(scanner.nextLine());

        for (int i = 0; i < 5000; i++) {
           podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}