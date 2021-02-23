package testes;

import exception.PessoaFalarException;
import pessoa.Funcionario;
import pessoa.Nome;

import java.math.BigDecimal;

public class Teste {

    public static void main(String[] args) {

        try {

            Funcionario funcionario = Funcionario.criar(Nome.criar("Asdrubal", "José"), "444.444.444-44", new BigDecimal(1000));

            funcionario.andar(5);
            funcionario.falar(40);

        } catch (PessoaFalarException ex) {
            System.out.println("Erro em funcionário ao falar: " + ex.getMessage());
            ex.printStackTrace();
        }



        /*
        Cliente asdrubal = Cliente.criar(Nome.criar("Asdrubal","Sava"), "222.222.222-22", "Desenvolvedor");
        System.out.println("Asdrubal: " + asdrubal.cpf);

        Cliente nikherson = Cliente.criar(Nome.criar("Nikherson", "Brenno"), "333.333.333-33", "Estudante");
        System.out.println("Nikherson: " + nikherson.cpf);

        Cliente tiburcio = Cliente.criar(Nome.criar("Tiburcio", "José"), "444.444.444-44", "Professor");
        System.out.println("Tiburcio: " + tiburcio.cpf);

        System.out.println("Asdrubal: " + Cliente.cpf);
        System.out.println("Nikherson: " + Cliente.cpf);
        System.out.println("Tiburcio: " + Cliente.cpf);

         */
    }
}
