import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro();
        System.out.println("Qual o nome do primeiro livro? ");
        livro1.setTitulo(scanner.nextLine());
        System.out.println("Qual o autor do livro? ");
        livro1.setAutor(scanner.nextLine());

        Livro livro2 = new Livro();
        System.out.println("\nQual o nome do segundo livro? ");
        livro2.setTitulo(scanner.nextLine());
        System.out.println("Qual o auto do livro? ");
        livro2.setAutor(scanner.nextLine());

        livro1.exibeDetalhes();
        livro2.exibeDetalhes();

    }
}