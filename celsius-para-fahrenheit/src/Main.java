import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa conversor de Celsius para Fahrenheit\n");

        System.out.println("Informe a temperatura em Celsius: ");
        double temperaturaCelsius = input.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        int fahrenheitInteiro = (int) temperaturaFahrenheit;

        String mensagem = String.format("\nA temperatura de %.1f Celsius é equivalente a %.1f Fahrenheits", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);
        System.out.println("(Exercício casting) Fahrenheit sem casa decimal: " + fahrenheitInteiro);
    }
}
