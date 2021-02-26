package list;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);

        Integer idade = Integer.valueOf(29);//Autoboxing: transforma do tipo primitivo para um tipo referência Integer.
        int valor = idade.intValue();//Unboxing: pega um tipo referência e coloca em um tipo primitivo.

        Double ref = Double.valueOf(3.2);//Autoboxing
        double refr = ref.doubleValue();//Unboxing

        List<Integer> numeros = new ArrayList<>();
        numeros.add(idade);
        numeros.add(39);//Autoboxing.

        System.out.println("Primeiro número: " + numeros.get(0));
        System.out.println("Segundo número: " + numeros.get(1));
    }

}
