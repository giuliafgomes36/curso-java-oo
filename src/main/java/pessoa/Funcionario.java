package pessoa;

import exception.PessoaFalarException;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

    private BigDecimal salario;

    public Funcionario() { }

    public Funcionario(Nome nome, String cpf, BigDecimal salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public static Funcionario criar(Nome nome, String cpf, BigDecimal salario) {
        return new Funcionario(nome, cpf, salario);
    }

    public void trabalhar() {
        System.out.println("O funcionário " + nome + " trabalhou!");
    }

    public void falar(Integer tempo) throws PessoaFalarException {
        if (tempo > 30)
            throw new PessoaFalarException("Funcionário não pode falar por mais de 30min.");
        System.out.println("O funcionário " + nome + " falou por " + tempo + " minutos.");
    }

    public void andar(Integer metros) {
        System.out.println("O funcionário " + nome + " andou " + metros + " metros.");
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
