package exception;

import conta.Conta;

public class TesteSaldoException {

    public static void main(String[] args) {
        Conta conta = new Conta(123,321);
        Conta conta1 = new Conta(456,654);

        conta.deposita(200);

        //conta.saca(100);

        System.out.println(conta.getSaldo());
        System.out.println(conta1.getSaldo());

        try {
            conta.transfere(220, conta1);
        } catch (SaldoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
