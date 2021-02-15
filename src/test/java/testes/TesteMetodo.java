package testes;
import classes.Conta;

public class TesteMetodo {

    public static void main(String[] args) {

        //Depositando um valor:
        Conta conta1 = new Conta(789,987);
        conta1.deposita(50);
        System.out.println("Saldo da conta 1 após o depósito: " + conta1.getSaldo());

        System.out.println();

        //Sacando um valor
        conta1.saca(20);
        System.out.println("Saldo da conta1 após o saque: " + conta1.getSaldo());

        System.out.println();

        //Realizando uma transferência entre contas e usando e retorno boolean:
        Conta conta2 = new Conta(111,222);
        conta2.deposita(1000);
        System.out.println("Saldo da conta2 após o depósito: " + conta2.getSaldo());
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        System.out.println();

        if(conta2.transfere(300, conta1)){

            System.out.println("Transferência realizada com sucesso");
            System.out.println("Saldo da conta2 após a transferência: " + conta2.getSaldo());
            System.out.println("Sado da conta1 após a transferência: " + conta1.getSaldo());
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }

    }
}
