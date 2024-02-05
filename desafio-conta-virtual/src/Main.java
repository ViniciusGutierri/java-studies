import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeTitular = null;
        String tipoConta = null;
        int operacao;
        float saldo = 0;
        float valor = 0;
        float valorTransferencia = 0;

        operacao = exibirMenu(scanner);

        while(operacao != -1 ) {
            if (operacao == 1) {
                String[] cliente = criarCliente(scanner);
                saldo = iniciarSaldo(scanner);
                operacao = exibirMenu(scanner);
            } else if (operacao == 2) {
                saldo = consultarSaldo(saldo);
                operacao = exibirMenu(scanner);
            } else if (operacao == 3) {
                saldo = receberValor(scanner, saldo);
                operacao = exibirMenu(scanner);
            } else if (operacao == 4){
                saldo = transferirValor(scanner, saldo);
                operacao = exibirMenu(scanner);
            } else if (operacao == 5) {
                System.out.println("Encerrando a operação");
                break;
            } else {
                System.out.println("Informe uma opção válida ");
                operacao = exibirMenu(scanner);
            }
        }
    }

    public static int exibirMenu (Scanner scanner) {
        System.out.println("""
                ******************
                Menu de opções
                
                1. Criar conta
                2. Consultar saldo
                3. Receber valor
                4. Transferência
                5. Sair
                
                *******************
                """);
        //Tive que usar o input de nova linha pois ele impede que o código consuma o próximo input
        System.out.println("Insira uma opção para realizar alguma operação ");
        int operacao = scanner.nextInt();
        scanner.nextLine();

        return operacao;
    }

    public static String[] criarCliente(Scanner scanner) {
        System.out.println("• Insira o nome completo do titular");
        String nomeTitular = scanner.nextLine();

        System.out.println("• Insira o tipo de conta");
        String tipoConta = scanner.next();

        String[] cliente = {nomeTitular, tipoConta};

        return cliente;
    }

    public static float iniciarSaldo(Scanner scanner){
        System.out.println("• Insira o saldo inicial");
        float saldo = scanner.nextFloat();

        return saldo;
    }

    public static float consultarSaldo(float saldo){
        System.out.printf("• O saldo atual é %.2f \n", saldo);
        return saldo;
    }

    public static float receberValor(Scanner scanner, float saldo){
        System.out.println("• Informe o valor que você receberá");
        float valor = scanner.nextFloat();

        saldo += valor;

        System.out.printf("• O atual valor do seu saldo é de %.2f \n", saldo);

        return saldo;
    }

    public static float transferirValor(Scanner scanner, float saldo){
        System.out.println("• Informe o valor a ser tranferido");
        float valorTranferencia = scanner.nextFloat();

        if (valorTranferencia <= saldo) {
            saldo -= valorTranferencia;
            System.out.printf("• O seu saldo atual é de R$ %.2f \n", saldo);
        } else {
            System.out.printf("Não é possível realizar essa transferência! Seu saldo é de R$ %.2f \n", saldo);
        }

        return saldo;
    }

}