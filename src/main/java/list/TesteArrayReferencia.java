package list;

import conta.Conta;
import conta.ContaCorrente;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        Conta conta = new Conta(123,123);
        ContaCorrente contaCorrente = new ContaCorrente(321,321);

        contas[0] = conta;
        contas[1] = contaCorrente;

        ContaCorrente ref = (ContaCorrente) contas[1];//cast avisando que a referencia passada é mesmo de uma conta corrente

        System.out.println(conta.getNumero());
        System.out.println(contas[0].getNumero());

        System.out.println(contaCorrente.getNumero());
        System.out.println(contas[1].getNumero());

    }
}
