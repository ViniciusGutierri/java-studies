public class Livro implements Calculavel {
    private double preco;
    private double desconto;

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
