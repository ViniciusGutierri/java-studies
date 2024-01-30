import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Conversor de dólares para reais");

        double dolar = 4.94;

        System.out.println("\nQuantos dólares deseja converter? ");
        double valorEmDolares = input.nextDouble();


        double valorEmReais = valorEmDolares * dolar;

        System.out.printf("O valor em reais é: %.2f", valorEmReais);
    }
}
