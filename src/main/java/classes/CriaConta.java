package classes;

public class CriaConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.deposita(200);
        conta1.setNumero(1);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Giulia Ferreira";
        cliente1.cpf = "222.222.222-22";
        cliente1.profissao = "Estagiária";

        conta1.setTitular(cliente1); //Estou referenciando que o titular da conta1 é a cliente1.
        System.out.println("O titular da conta " + conta1.getNumero() + " é: "+ conta1.getTitular().nome);

        //Mostrando que o conta1.titular e o cliente1 fazem referência para o mesmo objeto.
        System.out.println(conta1.getTitular());
        System.out.println(cliente1);

        System.out.println();

        //Criando titular de outra maneira:
        Conta conta2 = new Conta();
        conta2.setNumero(2);

        conta2.setTitular(new Cliente());
        conta2.getTitular().nome = "Giulia Ferreira";
        System.out.println("O titular da conta " + conta2.getNumero() + " é: "+ conta2.getTitular().nome);





    }
}
