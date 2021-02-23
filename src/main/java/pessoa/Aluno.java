package pessoa;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() { }

    public Aluno(Nome nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public void estudar(){
        System.out.println("O aluno " + nome + " estudou!");
    }

    public void falar(Integer tempo) {
        System.out.println("O aluno " + nome + " falou por " + tempo + " tempo.");
    }

    public void andar(Integer metros){
        System.out.println("O aluno " + nome + " andou " + metros +" metros.");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
