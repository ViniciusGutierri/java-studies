public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.printf("Tabuada do %d: \n", numero);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", numero, i, numero * i);
        }
    }
}
