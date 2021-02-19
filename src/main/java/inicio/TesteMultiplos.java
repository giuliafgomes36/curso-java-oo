package inicio;

public class TesteMultiplos {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++){
            if (numero % 3 == 0){
                //Se o resto da divisão do número por 3 for igual a zero, o número é múltiplo de 3.
                System.out.println(numero);
            }
        }

        System.out.println();

        for (int numero = 3; numero < 100; numero += 3){
            System.out.println(numero);
        }
    }
}
