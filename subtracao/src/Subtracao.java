import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números para verificarmos a diferença entre eles.\n");
        System.out.println("Informe o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        float num2 = input.nextFloat();

        float subtracao = num1 - num2;

        System.out.printf("A diferença entre os números é %.2f \n", subtracao);
    }
}
