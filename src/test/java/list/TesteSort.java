package list;

import conta.Conta;
import conta.ContaCorrente;
import pessoa.Cliente;
import pessoa.Nome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteSort {

    public static void main(String[] args) {

        //Criando contas e titulares:
        Conta conta1 = new Conta(11,11);
        Cliente cliente1 = new Cliente();
        cliente1.setNome(Nome.criar("Giulia", "Ferreira"));
        conta1.setTitular(cliente1);
        conta1.deposita(11);

        Conta conta2 = new Conta(11,44);
        Cliente cliente2 = new Cliente();
        cliente2.setNome(Nome.criar("Romeu","Gervasio"));
        conta2.setTitular(cliente2);
        conta2.deposita(44);

        ContaCorrente contaCorrente1 = new ContaCorrente(11,33);
        Cliente cliente3 = new Cliente();
        cliente3.setNome(Nome.criar("Giulia","Borges"));
        contaCorrente1.setTitular(cliente3);
        contaCorrente1.deposita(33);

        ContaCorrente contaCorrente2 = new ContaCorrente(11,22);
        Cliente cliente4 = new Cliente();
        cliente4.setNome(Nome.criar("Carlos","Alberto"));
        contaCorrente2.setTitular(cliente4);
        contaCorrente2.deposita(22);

        //Adicionando contas à lista:
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);

        //Ordenando:

        System.out.println("Ordenando pelo número da conta:");

        for (Conta conta : contas){
            System.out.println(conta);//Chama o toString
        }

        contas.sort(new NumeroComparator());//sort recebe como parâmetro uma referência de uma classe que implementa a interface Comparator.

        System.out.println();

        for (Conta conta : contas){
            System.out.println(conta);//Chama o toString
        }

        System.out.println();
        System.out.println("Ordenando pelo titular da conta:");

        for (Conta conta : contas){
            System.out.println(conta);
        }

        contas.sort(new TitularComparator());

        System.out.println();

        for (Conta conta : contas){
            System.out.println(conta);
        }

        System.out.println();
        System.out.println("Ordem natural: saldo");

        for (Conta conta : contas){
            System.out.println(conta);
        }

        Collections.sort(contas);

        System.out.println();

        for (Conta conta : contas){
            System.out.println(conta);
        }


    }
}

class TitularComparator implements Comparator<Conta>{
    @Override
    public int compare(Conta conta1, Conta conta2) {

        String nome1 = conta1.getTitular().getNome().nomeCompleto();
        String nome2 = conta2.getTitular().getNome().nomeCompleto();

        return nome1.compareTo(nome2);
    }
}

class NumeroComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta conta1, Conta conta2) {

        return Integer.compare(conta1.getNumero(), conta2.getNumero());
    }
}
