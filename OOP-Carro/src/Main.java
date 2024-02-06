public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "BYD TAN";
        carro.cor = "Branco";
        carro.ano = 2022;

        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.calculaIdadeCarro());
    }
}