package list;

import conta.Conta;
import conta.ContaCorrente;
import pessoa.Cliente;
import pessoa.Nome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        //Criando contas e titulares:
        Conta conta1 = new Conta(11, 11);
        Cliente cliente1 = new Cliente(Nome.criar("Giulia", "Ferreira"), "222.222.222-22", "Estagiaria");
        conta1.setTitular(cliente1);
        conta1.deposita(11);

        Conta conta2 = new Conta(11, 44);
        Cliente cliente2 = new Cliente(Nome.criar("Romeu", "Gervasio"), "333.333.333-33", "Agrônomo");
        conta2.setTitular(cliente2);
        conta2.deposita(44);

        ContaCorrente contaCorrente1 = new ContaCorrente(11, 33);
        Cliente cliente3 = new Cliente(Nome.criar("Giulia", "Borges"), "444.444.444-44", "Estudante");
        contaCorrente1.setTitular(cliente3);
        contaCorrente1.deposita(33);

        ContaCorrente contaCorrente2 = new ContaCorrente(11, 22);
        Cliente cliente4 = new Cliente(Nome.criar("Carlos", "Alberto"), "555.555.555-55", "Ator");
        contaCorrente2.setTitular(cliente4);
        contaCorrente2.deposita(22);

        //Adicionando contas à lista:
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);

        //Criando um comparator de forma anônima:

        System.out.println("Ordenando pelo número:");
        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta conta1, Conta conta2) {
                return Integer.compare(conta1.getNumero(), conta2.getNumero());
            }
        });

        for (Conta conta : contas) {
            System.out.println(conta);//chama o toString.
        }
        System.out.println();

        System.out.println("Ordenando pelo titular:");
        Comparator<Conta> comparator = new Comparator<Conta>() {
            @Override
            public int compare(Conta conta1, Conta conta2) {
                String nome1 = conta1.getTitular().getNome().nomeCompleto();
                String nome2 = conta2.getTitular().getNome().nomeCompleto();

                return nome1.compareTo(nome2);
            }
        };

        contas.sort(comparator);

        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
