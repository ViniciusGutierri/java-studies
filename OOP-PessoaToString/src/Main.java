import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        System.out.println("Pessoa1. Qual o seu nome? ");
        pessoa1.setNome(scanner.nextLine());
        System.out.println("Pessoa1. Qual a sua idade? ");
        pessoa1.setIdade(scanner.nextInt());
        listaDePessoas.add(pessoa1);
        scanner.nextLine();

        Pessoa pessoa2 = new Pessoa();
        System.out.println("\nPessoa2. Qual o seu nome? ");
        pessoa2.setNome(scanner.nextLine());
        System.out.println("Pessoa2. Qual a sua idade? ");
        pessoa2.setIdade(scanner.nextInt());
        listaDePessoas.add(pessoa2);
        scanner.nextLine();

        Pessoa pessoa3 = new Pessoa();
        System.out.println("\nPessoa3. Qual o seu nome? ");
        pessoa3.setNome(scanner.nextLine());
        System.out.println("Pessoa3. Qual a sua idade? ");
        pessoa3.setIdade(scanner.nextInt());
        listaDePessoas.add(pessoa3);

        System.out.println("\nTamanho da lista de pessoas: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome() + ", " + listaDePessoas.get(0).getIdade());

        System.out.println(listaDePessoas);
    }
}