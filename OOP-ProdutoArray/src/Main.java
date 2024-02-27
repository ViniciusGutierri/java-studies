import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Detergente", 7.90);
        Produto produto2 = new Produto("Arroz", 15.90);
        Produto produto3 = new Produto("Queijo", 12.00);
        Produto produto4 = new Produto("Pão", 2.20);
        Produto produto5 = new Produto("Bolacha", 3.90);
        Produto produto6 = new Produto("Doce de leite", 15.50);

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produto4);
        lista.add(produto5);
        lista.add(produto6);

        double somaPrecos = 0;
        for (Produto produto : lista) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / lista.size();
        System.out.printf("Preço médio dos produtos: R$%.2f", precoMedio);
    }
}