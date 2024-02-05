import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo do número secreto!");
        System.out.println("VOCÊ TEM 5 TENTATIVAS!");

        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("\nDigite um número entre 0 e 100: ");
            int chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.printf("Parabéns, você acertou o número secreto em %d tentativas! O número era %d", tentativas, numeroSecreto);
                break;
            } else if (chute < numeroSecreto) {
                System.out.println("O seu chute foi menor que o número secreto! Tente um número MAIOR!");
            } else {
                System.out.println("O seu chute foi maior que o número secreto! Tente um número MENOR!");
            }
        }

        if (tentativas == 5) {
            System.out.println("Suas tentativas acabaram. O número era " + numeroSecreto);
        }
    }
}