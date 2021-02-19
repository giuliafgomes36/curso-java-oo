package inicio;

public class TesteCaracteres {
    public static void main(String[] args) {

        char letra = 'a'; //cabe apenas uma letra, usamos aspas simples.
        char valor = 66; //char é uma variável numérica que faz a conversão para uma letra.

        //valor = valor + 1; não funciona pois o java transforma o valor do resultado no maior valor usado na conta (1 - int)
        valor = (char) (valor + 1); //estou dizendo que retorna um char e não um int

        System.out.println(letra);
        System.out.println(valor);

        //String:
        String frase = "Minha primeira frase.";
        System.out.println(frase);
    }
}
