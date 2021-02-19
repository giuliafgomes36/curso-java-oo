package inicio;

public class TesteCondicional {

    public static void main(String[] args) {
        int idade1 = 21;
        int idade2 = 16;
        int quantidadePessoas = 3;

        if (idade1 >= 18){
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Você não pode entrar");
        }

        System.out.println();

        //Apenas uma linha:
        if (idade2 >= 18) System.out.println("Você tem mais de 18 anos, pode entrar");
        else System.out.println("Você não pode entrar");

        System.out.println();

        //Elseif:
        if (idade2 >=18) {
            System.out.println("Você pode entrar");
        } else {
            if (quantidadePessoas >=2) {
                System.out.println("Voce não tem 18, mas pode entrar");
            } else {
                System.out.println("Voce não pode entrar");
            }
        }
    }
}
