import java.util.Scanner;

public class BigDesafioAlura {
    public static void main(String[] args) {
        System.out.println();
        Scanner entradaDeDadosDoCliente = new Scanner(System.in);
        int saldo = 2500;

        String cliente = """
    *********************************
    Dados Iniciais do cliente :            
    Nome: Cristian Saraiva Bettuci
    Tipo conta     -  Corrente  
    Número da conta - 272931
    Saldo inicial :""";


        System.out.println(cliente +saldo+"\n*********************************");
        String tiposDeOperacoes = """
    1- Consultar Saldos;
    2- Receber Valor;
    3- Transferir Valor;
    4-Sair;
        """;
        System.out.println(tiposDeOperacoes);
        System.out.print("Seleciona a Opção desejada :\n ");
    int selecioneOpcao = entradaDeDadosDoCliente.nextInt();
    int valorInserir= 0;
    int valorAtual = 0;
    int valorTransferir = 0;
    int i = 0;

    while(i != 4) {


        switch (selecioneOpcao){

            case 1 :
                System.out.println("O Seu saldo atual é :.........R$"+saldo+".............");
                break;

            case 2 :
                System.out.println("Digite o valor que quer inserir em sua conta: ");
                valorInserir = entradaDeDadosDoCliente.nextInt();
                saldo = valorInserir + saldo+ valorAtual;
                System.out.println( "O Seu saldo atual é :.........R$"+saldo+".............");
                break;

            case 3:
                System.out.println("Digite o valor que quer transferir");
                valorTransferir = entradaDeDadosDoCliente.nextInt();
                if(valorTransferir > saldo){
                    System.out.println(" Saldo Insuficiente, consulte o seu gerente da conta!");
                    break;
                }
                saldo =  saldo + valorAtual - valorTransferir ;
                System.out.println("O Seu saldo atual é :.........R$"+saldo+".............");
                break;


        }

        if(selecioneOpcao > 4){

            System.out.println("Opção invalida");
        } else if (selecioneOpcao == 4) {
            System.out.println("Programa finalizado com Sucesso!");
            break;

        }
        System.out.println(tiposDeOperacoes);
        System.out.println("Deseja continuar ou Sair do programa? ");
        selecioneOpcao = entradaDeDadosDoCliente.nextInt();



        i++;
       }

    }
}
