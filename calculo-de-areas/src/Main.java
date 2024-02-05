import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma das opções abaixo para calcular a área das formas geométricas a seguir ");
        System.out.println("""
                1. Quadrado
                2. Círculo 
                3. Retângulo
                4. Sair
                """);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("** Você escolheu Quadrado **");
                System.out.println("Informe o tamanho do lado");
                int lado = scanner.nextInt();
                int areaQuadrado = lado * lado;
                System.out.printf("O total da área do quadrado é %d", areaQuadrado);
                break;
            case 2:
                System.out.println("** Você escolheu Círculo **");
                System.out.println("Informe o tamanho do raio");
                int raio = scanner.nextInt();
                double areaCirculo = (Math.pow(raio, 2) * 3.14);
                System.out.printf("A área do círculo é de %.2f ", areaCirculo);
                break;
            case 3:
                System.out.println("** Você escolheu Retângulo **");
                System.out.println("Informe o valor da base e o valor da altura");
                System.out.println("Informe o valor da base ");
                int base = scanner.nextInt();
                System.out.println("Informe o valor da altura ");
                int altura = scanner.nextInt();
                int areaRetangulo = base * altura;
                System.out.printf("O valor da área do retângulo é de %d", areaRetangulo);
                break;
            case 4:
                System.out.println("Encerrando o programa");
                break;
            default:
                System.out.println("Informe uma opção válida");
                break;
        }
    }
}