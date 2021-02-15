package testes;

import classes.Conta;//Importamos a classe para poder usar em um pacote distinto.

public class TesteReferencia {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.deposita(200);

        Conta conta2 = conta1; //Temos duas referências conta1 e conta2 para o mesmo objeto.
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        if(conta1 == conta2){
            System.out.println("São a mesma conta");
        }

        //Mostando que as referências armazenam o mesmo endereço para o objeto Conta.
        System.out.println(conta1);
        System.out.println(conta1);

    }
}
