public class ProdutoFisico implements Calculavel {
    private double preco;
    private double taxaAdicional;

    @Override
    public double calcularPrecoFinal() {
        return preco + (taxaAdicional / 100);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }
}
