package inicio;

public class TesteValores {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;

        numero2 = numero1;
        numero1 = 10;

        System.out.println(numero1);
        System.out.println(numero2);
    }
}
