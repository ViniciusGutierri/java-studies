import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá, " + nome);
        System.out.println("Tudo bem?");
    }
}
