package list;

import conta.Conta;

import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {

    public static void main(String[] args) {

        List<Conta> contas = new LinkedList<>();
        //Lista bem semelhante à ArrayList, mas trabalha com ponteiros para indicar a sequência.

        Conta conta = new Conta(123,123);
        contas.add(conta);

        System.out.println(contas.size());
        System.out.println(contas.contains(conta));
        //Possui os mesmo métodos da ArrayList, pois ambas implementam a interface List.


    }
}
