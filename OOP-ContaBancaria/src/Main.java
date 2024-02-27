import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 3200.50);
        ContaBancaria conta2 = new ContaBancaria(524, 9700.80);
        ContaBancaria conta3 = new ContaBancaria(985, 500.84);
        ContaBancaria conta4 = new ContaBancaria(657, 1437.92);

        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);

        ContaBancaria contaMaiorSaldo = lista.get(0);
        for (ContaBancaria conta : lista) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}