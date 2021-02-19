package inicio;

public class TesteWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }
        System.out.println(contador); //O último contador++ deixa a variável valendo 11 e não entra mais no while.
        System.out.println();

        System.out.println("Exercício: Somar os números de 0 a 10");
        int contadorExercicio = 0;

        System.out.println("Tentativa 1:");
        while (contadorExercicio <=10){
            int totalInterno = 0;
            totalInterno = totalInterno + contadorExercicio;
            contadorExercicio++;
            System.out.println(contadorExercicio);
        } //Toda vez que entramos no laço a variável "total" é inicializada com o valor zero.

        System.out.println();
        System.out.println("Tentativa 2:");

        contadorExercicio = 0;
        int totalExterno =0;

        while (contadorExercicio <=10) {
            totalExterno += contadorExercicio;
            System.out.println(totalExterno);
            contadorExercicio++;
        }
    }
}
