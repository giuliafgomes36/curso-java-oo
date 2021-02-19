package inicio;

public class TesteVariaveis {
    public static void main(String[] args) {

        //Java é uma linguagem estaticamente tipada: precisamos declarar todas as variáveis que serão usadas com seu tipo.
        int idade = 21;
        double salario = 1250.70;

        System.out.println("Eu tenho " + idade + " anos. E meu salário é " + salario + " reais");
        System.out.println();

        //Contas:
        System.out.println("Contas:");

        int divisao = 5/2; //força um inteiro

        double novaDivisao = 5/2; //faz a conta como se fosse divisão de inteiros e armazena em um double

        double novaTentativa = 5.0 /2; //faz a conta pensando em ponto flutuante

        System.out.println("A divisão 5/2 armazenada em uma variável int = " + divisao);
        System.out.println("A mesma divisão armazenada em uma variável double = " + novaDivisao);
        System.out.println("A divisão 5.0 / 2 armazenada em um double = " + novaTentativa + ", que é o resultado esperado");
        System.out.println();

        //Conversão:
        System.out.println("Conversão:");

        int valor = (int) salario; //casting: nesse caso vai mostrar apenas a parte inteira do número

        System.out.println("Usando o casting para inteiro o salário vai de " + salario + " para " + valor);

    }
}
