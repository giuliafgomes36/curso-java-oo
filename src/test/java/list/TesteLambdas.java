package list;

import conta.Conta;
import conta.ContaCorrente;
import pessoa.Cliente;
import pessoa.Nome;

import java.util.ArrayList;
import java.util.List;

public class TesteLambdas {

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

        //Trabalhando com lambdas:

        System.out.println("Ordenando pelo número:");

        contas.sort( (c1, c2) -> Integer.compare(c1.getNumero(),c2.getNumero()));
        //Não precisa indicar o tipo dos parâmetros pois a lista é de contas,
        //a seta indica a regra a ser executada pelo método.

        contas.forEach((conta) -> System.out.println(conta));
        //Passando o foreach como lambda.
        System.out.println();

        System.out.println("Ordenando pelo titular:");

        contas.sort( (c1, c2) -> {
            String nome1 = c1.getTitular().getNome().nomeCompleto();
            String nome2 = c2.getTitular().getNome().nomeCompleto();

            return nome1.compareTo(nome2);
        });

        contas.forEach( (conta) -> System.out.println(conta));

    }
}
