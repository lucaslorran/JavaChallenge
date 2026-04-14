//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaChallenge {

    public static void apresentaDadosCliente(){
        System.out.println("""
                           \n*******************************************************
                           Dados iniciais do cliente:
                           
                           Nome:            Jacqueline Oliveira
                           Tipo conta:      Corrente
                           Saldo inicial:   R$ 2500,00
                           *******************************************************
                           """);
    }

    public static void apresentaOperacoesDisponiveis(){
        System.out.println("""
                           \nOperações
                           
                           1 - Consultar saldos
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 2500;
        int opcaoDesejada;

        apresentaDadosCliente();

        do{
            apresentaOperacoesDisponiveis();
            opcaoDesejada = lerValor("Digite a opção desejada:", scanner);

            switch (opcaoDesejada) {
                case 1:
                    System.out.println(String.format("\nO saldo atual é R$%.2f", saldo));
                    break;
                case 2:
                    System.out.println("Valor invalido!");
            }


        } while(opcaoDesejada != 4);




    }
}