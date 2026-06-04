import java.util.Scanner;

public class DesafioBanco {
    static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String nome = "Gabriel Pires";
        String tipoConta = "Corrente";

        double saldo = 2500.00;
        double receber = 0;
        double tranferencia = 0;


        System.out.println("************************************");
        System.out.println("Nome:              " + nome);
        System.out.println("Tipo da conta:     " + tipoConta);
        System.out.println("Saldo:             " + saldo);
        System.out.println("************************************");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Tranferir valor
                    4- Sair
                    
                    """);

            System.out.println("Digite a opção desejada: ");
            opcao = Scanner.nextInt();

            if (opcao == 1) {
                System.out.println(String.format("O saldo atual é de R$ %.2f", saldo));

            } else if (opcao == 2){
                System.out.println("Informe o valor a receber: ");
                receber = Scanner.nextDouble();
                saldo += receber;
                System.out.println(String.format("O saldo atual é de R$ %.2f", saldo));

            } else if (opcao == 3){
                System.out.println("Informe o valor que deseja tranferir: ");
                tranferencia = Scanner.nextDouble();
                if (tranferencia > saldo){
                    System.out.println("Não a saldo suficiente para a tranferencia");
                } else {
                    saldo -= tranferencia;
                    System.out.println(String.format("O saldo atual é de R$ %.2f", saldo));
                }

            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Entrada invalida");
            }
        }

    }
}
