package classes;

public class Conta {
    //Os atributos por padrão são zerados.
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
