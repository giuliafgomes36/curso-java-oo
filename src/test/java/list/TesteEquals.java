package list;

import conta.Conta;

import java.util.ArrayList;

public class TesteEquals {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new  ArrayList<>();

        Conta conta1 = new Conta(1,1);
        contas.add(conta1);

        Conta conta2 = new Conta(2,2);
        contas.add(conta2);

        System.out.println("Verificando se a lista possui a conta 1 referenciada pela variável conta1 " + contas.contains(conta1));

        Conta conta3 = new Conta(1,1);

        System.out.println("Verificando se a lista possui a conta 1 referenciada pela variável conta3 " + contas.contains(conta3));
        //O método contains olha apenas as referências mesmo que o objeto seja igual.

        //Queremos verificar se uma conta ja existe em nossa lista não só pela referência,
        //por isso vamos sobrescrever um método em nossa classe conta: equals.

        System.out.println(conta1.equals(conta3));





    }
}
