import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números para verificarmos sua soma\n");
        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();

        float soma = num1 + num2;
        float media = (num1 + num2) / 2;

        System.out.printf("A soma dos números é %.2f \n", soma);
        System.out.printf("A média dos números é %.2f \n", media);
    }
}
