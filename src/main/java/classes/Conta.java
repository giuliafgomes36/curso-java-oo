package classes;

public class Conta {
    //Os atributos por padrão são zerados.
    public double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita (double valor){
        this.saldo += valor;//Usamos o this para referir ao atributo do objeto que invocou o método.
    }
}
