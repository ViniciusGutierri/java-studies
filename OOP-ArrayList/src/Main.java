import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Cachorro");
        lista.add("Gato");
        lista.add("Pássaro");
        lista.add("Camaleão");

        for (String item : lista) {
            System.out.println(item);
        }
    }
}