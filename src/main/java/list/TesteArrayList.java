package list;

import conta.Conta;
import conta.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        //Array list com generics para tipificar minha lista
        ArrayList<Conta> contas = new ArrayList<>();

        //Criando contas
        ContaCorrente contaCorrente = new ContaCorrente(11,11);
        contas.add(contaCorrente);

        ContaCorrente contaCorrente1 = new ContaCorrente(22,22);
        contas.add(contaCorrente1);

        Conta conta = new Conta(33,33);
        contas.add(conta);

        Conta conta1 = new Conta(44,44);
        contas.add(conta1);

        System.out.println("Tamanho da lista: " + contas.size());

        contas.remove(0);//removendo primeiro item da lista

        System.out.println("Tamanho da lista após remoção: " + contas.size());//imprimindo tamanho
        System.out.println((contas.get(0)).getAgencia());

        System.out.println("For diferente:");

        for (Conta c : contas){
            System.out.println(c);
        }

    }






}
