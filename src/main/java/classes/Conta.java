package classes;

public class Conta {
    //Os atributos por padrão são zerados.
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero){
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

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
        if (agencia <= 0){
            System.out.println("ERRO: Agência inválida");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("ERRO: Número inválido");
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
