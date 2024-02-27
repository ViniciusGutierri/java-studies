import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}