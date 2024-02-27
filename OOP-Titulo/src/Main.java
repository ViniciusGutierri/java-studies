import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> lista = new LinkedList<>();
        lista.add(new Titulo("A"));
        lista.add(new Titulo("H"));
        lista.add(new Titulo("F"));

        Collections.sort(lista);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
        }
    }
}