package inicio;

public class TesteFor {

    public static void main(String[] args) {

        for (int contador =0; contador <= 10; contador++){
            System.out.println(contador);
        }
        //Não conseguimos imprimir aqui fora a variável contador, ela existe apenas dentro do for.
        System.out.println();

        //Tabuada:
        for (int multiplicador = 1; multiplicador <=10 ; multiplicador++){
            System.out.println("Tabuada do " + multiplicador + ":");

            for (int contador = 0; contador <=10 ; contador++){
                System.out.print(multiplicador * contador + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Desenhando um triângulo:
        for (int linha = 0; linha < 10; linha++){
            for (int coluna = 0; coluna < 10; coluna++){
                if (coluna > linha){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
