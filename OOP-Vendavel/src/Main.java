import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Preço unitário do produto: ");
        produto.setPrecoUnitario(scanner.nextDouble());
        System.out.println("Percentual de desconto: ");
        produto.aplicarDesconto(scanner.nextDouble());
        System.out.println("Quantidade: ");
        double precoTotalProduto = produto.calcularPrecoTotal(scanner.nextInt());
        System.out.println("Preço total do produto: " + precoTotalProduto);

        Servico servico = new Servico();
        System.out.println("\nPreço por hora: ");
        servico.setPrecoHora(scanner.nextDouble());
        System.out.println("Percentual de desconto: ");
        servico.aplicarDesconto(scanner.nextDouble());
        System.out.println("Quantidade: ");
        double precoTotalServico = servico.calcularPrecoTotal(scanner.nextInt());
        System.out.println("Preço total do serviço: " + precoTotalServico);
    }
}