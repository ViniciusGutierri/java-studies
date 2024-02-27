import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(12);
        lista.add(5);
        lista.add(17);
        lista.add(19);
        lista.add(21);
        lista.add(3);
        lista.add(90);

        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}