import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo de média entre duas notas\n");

        System.out.println("Informe a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média é: " + media);
    }
}
