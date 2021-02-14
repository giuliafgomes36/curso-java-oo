package classes;

public class CriaConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.saldo = 200;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Giulia Ferreira";
        cliente1.cpf = "222.222.222-22";
        cliente1.profissao = "Estagiária";

        conta1.titular = cliente1; //Estou referenciando que o titular da conta1 é a cliente1.

        System.out.println(conta1.titular.nome);

        //Mostrando que o conta1.titular e o cliente1 fazem referência para o mesmo objeto.
        System.out.println(conta1.titular);
        System.out.println(cliente1);




    }
}
