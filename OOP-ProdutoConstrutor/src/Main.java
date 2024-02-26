import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Pote Sorvete Bacio di Latte", 41.90, 3);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Tamanho da lista de produtos: " + produtos.size());

        System.out.println("Primeiro produto: " + produtos.get(0).getNome());

        System.out.println("\n");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto X", 12.75, 2, "2024-12-31");
        System.out.println(produtoPerecivel);
    }
}