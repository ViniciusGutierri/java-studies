import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para descobrir sua tabuada: ");
        int numero = scanner.nextInt();
        int multiplicador = 0;
        int resultado;

        while (multiplicador < 11){
            resultado = multiplicador * numero;
            System.out.println(resultado);
            multiplicador ++;
        }
    }
}