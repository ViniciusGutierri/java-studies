import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular seu fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = numero;
        int resultado = 1;

        while (fatorial != 0){
            resultado *= fatorial;
            fatorial --;
        }

        System.out.printf("O fatorial de %d é %d", numero, resultado);
    }
}