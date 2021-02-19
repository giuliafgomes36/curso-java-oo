package inicio;

public class TesteFatoriais {
    public static void main(String[] args) {

        //Meu:
        for (int numero = 0; numero <= 10; numero++){
            int total = 1;

            for (int fatorial = 1; fatorial <= numero ; fatorial++){

                total = total * fatorial;

            }
            System.out.println("Fatorial de " + numero + " = " + total);
        }

        System.out.println();

        //Professor:
        int fatorial = 1;
        for (int i =1; i < 11; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
