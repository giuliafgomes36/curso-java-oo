package exception;

import exception.Checked;
import exception.PessoaFalarException;

public class TestePessoaFalarException {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        Checked checked = new Checked();
        try {
            checked.depositar();
        } catch (PessoaFalarException ex){
            System.out.println("tratamento");
        }

        try {
            metodo1();
        } catch (Exception ex) {
            System.out.println("Exception " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws PessoaFalarException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws PessoaFalarException {
        System.out.println("Ini do metodo2");
        throw new PessoaFalarException("deu errado");
        //System.out.println("Fim do metodo2");
    }
}
