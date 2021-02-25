package conta;

/**
 * Moldura de uma conta
 *
 * @author Giulia Ferreira Gomes
 */

import exception.SaldoException;
import pessoa.Cliente;

import java.util.Objects;

public class Conta {
    //Os atributos por padrão são zerados.
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;//O static esta se referenciando à classe e não a um objeto em específico.

    //Construtor
    public Conta(int agencia, int numero){
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

    public void deposita (double valor){
        this.saldo += valor;//Usamos o this para referir ao atributo do objeto que invocou o método.
    }

    public void saca (double valor) throws SaldoException{
        if (this.saldo < valor){
            throw new SaldoException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) throws SaldoException{
            this.saca(valor);
            destino.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
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

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public boolean equals(Object o) {

        Conta conta = (Conta) o;

        if(this.agencia != ((Conta) o).agencia){
            return false;
        }
        if (this.numero != ((Conta) o).numero){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                '}';
    }
}
