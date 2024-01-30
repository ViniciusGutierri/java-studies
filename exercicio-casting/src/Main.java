import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Exercício de casting\n");

        System.out.println("Informe um número decimal: ");
        double numero = input.nextDouble();

        int numeroInteiro = (int) numero;

        System.out.println("\nNúmero decimal digitado: " + numero);
        System.out.println("Número com casting para inteiro: " + numeroInteiro);
    }
}
