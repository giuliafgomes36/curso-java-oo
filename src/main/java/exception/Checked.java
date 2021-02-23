package exception;

public class Checked {

    public void depositar() throws PessoaFalarException {
        throw new PessoaFalarException("minha exception");
    }
}
