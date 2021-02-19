package inicio;

public class TesteCondicionalBoolean {
    public static void main(String[] args) {
        int idade = 16;
        int quantidadePessoas1 = 3;
        int quantidadePessoas2 = 1;
        boolean acompanhado = false;

        //Ou:
        if (idade >= 18 || quantidadePessoas1 >= 2){
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Você não pode entrar");
        }

        System.out.println();

        //E:
        if (idade >= 18 && quantidadePessoas2 >= 2){
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Você não pode entrar");
        }

        System.out.println();

        //Usando uma variável boolean:
        if (idade >=18 || acompanhado){
            System.out.println("Voce pode entrar");
        } else {
            System.out.println("Voce nao pode entrar");
        }
    }
}
