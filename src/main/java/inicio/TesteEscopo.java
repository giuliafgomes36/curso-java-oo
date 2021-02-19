package inicio;

public class TesteEscopo {
    public static void main(String[] args) {
        int idade = 16;
        int quantidadePessoas = 3;

        if (quantidadePessoas >= 2) {
            boolean acompanhado = true;
        } else {
            boolean acompanhado = false;
        }
        //Tivemos que declarar a variável duas vezes pois o escopo (tempo de vida) da mesma se limita ao abrir e fechar chaves.
        //Dessa forma não seria possivel fazer referência a ela fora dos métodos if e else.

        //Na linha de baixo inicia o escopo da variável:
        boolean acompanhado;
        if (quantidadePessoas >=2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        System.out.println(acompanhado);
        //Ele termina, nesse caso, junto com a chave de fechamento do main.
    }
}
