import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ModeloCarro carro = new ModeloCarro();

        carro.definirModelo("Sedan");

        System.out.println("Preço no Ano 1: ");
        carro.setPrecoAno1(scanner.nextDouble());
        System.out.println("Preço no Ano 2: ");
        carro.setPrecoAno2(scanner.nextDouble());
        System.out.println("Preço no Ano 3: ");
        carro.setPrecoAno3(scanner.nextDouble());

        carro.exibirInfo();
    }
}