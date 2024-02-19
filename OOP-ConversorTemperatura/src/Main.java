import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        System.out.println("Temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.printf("%.1fºC em Fahrenheit é: %.1fºF", celsius, conversor.celsiusParaFahrenheit(celsius));

        System.out.println("\n\nTemperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("%.1fºF em Celsius é: %.1fºC", fahrenheit, conversor.fahrenheitParaCelsius(fahrenheit));
    }
}