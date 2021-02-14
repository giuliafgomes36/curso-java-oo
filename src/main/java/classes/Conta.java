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

    public boolean saca (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >=valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
