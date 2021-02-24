package list;

import conta.Conta;
import conta.ContaCorrente;

public class ListaContas {

    private Conta[] referencias;
    private int contador;

    public ListaContas() {
        this.referencias = new Conta[10];
    }

    public void adicionar(Conta conta) {
        referencias[contador] = conta;
        contador++;
    }
}
