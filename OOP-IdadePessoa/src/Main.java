import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        idadePessoa pessoa1 = new idadePessoa();
        System.out.println("Qual o seu nome? ");
        pessoa1.setNome(scanner.nextLine());
        System.out.println("Qual a sua idade? ");
        pessoa1.setIdade(scanner.nextInt());
        scanner.nextLine();

        idadePessoa pessoa2 = new idadePessoa();
        System.out.println("\nQual o seu nome? ");
        pessoa2.setNome(scanner.nextLine());
        System.out.println("Qual a sua idade? ");
        pessoa2.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\n" + pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println("\n" + pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}