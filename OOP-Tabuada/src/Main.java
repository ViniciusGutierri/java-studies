import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        System.out.println("Tabuada de qual número? ");
        tabuada.mostrarTabuada(scanner.nextInt());
    }
}