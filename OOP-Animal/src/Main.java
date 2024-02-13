import br.com.vinicius.oopAnimal.Cachorro;
import br.com.vinicius.oopAnimal.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("-----------------------------");

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}