import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        System.out.println("Qual a altura da sala? ");
        double altura = scanner.nextDouble();

        System.out.println("Qual a largura da sala? ");
        double largura = scanner.nextDouble();

        sala.calcularArea(altura, largura);
        sala.calcularPerimetro(altura, largura);
    }
}