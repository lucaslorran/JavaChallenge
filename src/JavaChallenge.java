//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
                           2 - Receber valor
                           3 - Transferir valor
                           4 - Sair
                           """);
    }

    public static int lerValor(String mensagem, Scanner scanner){
        int valorInformado;

        System.out.println(mensagem);
        valorInformado = scanner.nextInt();
        scanner.nextLine();

        return valorInformado;
    }

    public static double receberTransferencia(double saldoAtual, Scanner scanner){

        double novoSaldo;
        double valorTransferencia;

        valorTransferencia = lerValor("Informe o valor a receber:",scanner);

        novoSaldo = saldoAtual + valorTransferencia;

        return novoSaldo;
    }

    public static double realizarTransferencia(double saldoAtual, Scanner scanner){

        double novoSaldo;
        double valorTransferencia;

        valorTransferencia = lerValor("Informe o valor que deseja transferir:",scanner);

        if(saldoAtual < valorTransferencia){
            novoSaldo = saldoAtual;
            System.out.println("\nNão há saldo suficiente para fazer essa transferência.");
        } else {
            novoSaldo = saldoAtual - valorTransferencia;
        }

        return novoSaldo;
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

            opcaoDesejada = lerValor("Digite a opção desejada:", scanner);

            switch (opcaoDesejada) {
                case 1:
                    System.out.println(String.format("\nO saldo atual é R$%.2f", saldo));
                    break;
                case 2:
                    saldo = receberTransferencia(saldo, scanner);
                    System.out.println(String.format("\nO saldo atualizado R$%.2f", saldo));
                    break;
                case 3:
                    saldo = realizarTransferencia(saldo, scanner);
                    System.out.println(String.format("\nO saldo atualizado R$%.2f", saldo));
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