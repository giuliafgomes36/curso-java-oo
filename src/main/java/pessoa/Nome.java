package pessoa;

public class Nome {

    private String nome;
    private String sobrenome;

    public Nome() { }

    public Nome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public static Nome criar(String nome, String sobrenome){
        return new Nome(nome, sobrenome);
    }

    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }

    public String toString(){
        return nomeCompleto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
