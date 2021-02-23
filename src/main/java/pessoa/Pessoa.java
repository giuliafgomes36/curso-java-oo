package pessoa;

public abstract class Pessoa {

    protected Nome nome;
    protected String cpf;

    public abstract void falar(Integer tempo) throws Exception;

    public abstract void andar(Integer metros);

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
