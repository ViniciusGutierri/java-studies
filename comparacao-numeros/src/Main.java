import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira dois números inteiros para que seja verificado qual é o maior ou se são iguais");

        System.out.println("Primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero2 == numero1){
            System.out.println("Os números são iguais");
        } else{
            int maiorNumero = Math.max(numero1, numero2);
            System.out.println("Os números são diferentes");
            System.out.printf("O maior número é %d ", maiorNumero);
        }
    }
}