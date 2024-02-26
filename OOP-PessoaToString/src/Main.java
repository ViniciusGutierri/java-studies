import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Qual o seu nome? ");
        pessoa.setNome(scanner.nextLine());
        System.out.println("Qual a sua idade? ");
        pessoa.setIdade(scanner.nextInt());

        System.out.println("Infos: " + pessoa.toString());
    }
}