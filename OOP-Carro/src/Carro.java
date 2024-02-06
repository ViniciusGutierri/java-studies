public class Carro {
    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("***************************");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("***************************");
    }

    int calculaIdadeCarro() {
        return 2024 - ano;
    }
}
