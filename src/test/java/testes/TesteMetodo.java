package testes;
import classes.Conta;

public class TesteMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(50);
        System.out.println(conta.saldo);
    }
}
