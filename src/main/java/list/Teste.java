package list;

import conta.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

        ListaContas listaContas = new ListaContas();

        ContaCorrente contaCorrente1 = new ContaCorrente(123,123);
        ContaCorrente contaCorrente2 = new ContaCorrente(456,456);

        listaContas.adicionar(contaCorrente2);
        listaContas.adicionar(contaCorrente1);



    }
}
