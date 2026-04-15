import java.util.Scanner;

public class JavaChallenge {

    public static void apresentaDadosCliente(String nome, String tipoConta, double saldo){
        System.out.println(String.format("""
                                         \n*******************************************************
                                         Dados iniciais do cliente:
                                         
                                         Nome:            %s
                                         Tipo conta:      %s
                                         Saldo inicial:   R$ %.2f
                                         *******************************************************
                                         """, nome, tipoConta, saldo));
    }

    public static void exibeMenu(){
        System.out.println("""
                           \nOperações
                           
                           1 - Consultar saldo
                           2 - Receber
                           3 - Transferir
                           4 - Sair
                           """);
    }

    public static double lerValor(String mensagem, Scanner scanner){
        double valorInformado;

        System.out.println(mensagem);
        valorInformado = scanner.nextInt();
        scanner.nextLine();

        return valorInformado;
    }

    public static double depositar(double saldoAtual, Scanner scanner){

        double novoSaldo;
        double valorTransferencia;

        valorTransferencia = lerValor("Informe o valor a receber:",scanner);

        novoSaldo = saldoAtual + valorTransferencia;

        return novoSaldo;
    }

    public static double transferir(double saldoAtual, Scanner scanner){

        double novoSaldo;
        double valorTransferencia;

        valorTransferencia = lerValor("Informe o valor que deseja transferir:",scanner);

        if(saldoAtual < valorTransferencia){
            novoSaldo = saldoAtual;
            System.out.println("\nSaldo insuficiente para fazer essa transferência.");
        } else {
            novoSaldo = saldoAtual - valorTransferencia;
        }

        return novoSaldo;
    }

    public static void exibirSaldo(double saldo){
        System.out.printf("\nSaldo atual R$%.2f%n", saldo);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;

        int opcaoDesejada;

        apresentaDadosCliente(nome,tipoConta,saldo);

        do{
            exibeMenu();

            opcaoDesejada = (int) lerValor("Digite a opção desejada:", scanner);

            switch (opcaoDesejada) {
                case 1:
                    exibirSaldo(saldo);
                    break;
                case 2:
                    saldo = depositar(saldo, scanner);
                    exibirSaldo(saldo);
                    break;
                case 3:
                    saldo = transferir(saldo, scanner);
                    exibirSaldo(saldo);
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        } while(opcaoDesejada != 4);

    }
}