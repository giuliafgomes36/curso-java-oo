package pessoa;

public class Cliente extends Pessoa {

    private String profissao;

    public Cliente() { }

    public Cliente(Nome nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public static Cliente criar(Nome nome, String cpf, String profissao) {
        return new Cliente(nome, cpf, profissao);
    }

    public void comprar(){
        System.out.println("O cliente " + nome + " comprou!");
    }

    public void falar(Integer tempo){
        System.out.println("O cliente " + nome + " falou!");
    }

    public void andar(Integer metros){
        System.out.println("O cliente " + nome + " andou!");
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
