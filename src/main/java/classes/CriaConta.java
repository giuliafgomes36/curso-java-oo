package classes;

public class CriaConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta(123,321);
        conta1.deposita(200);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Giulia Ferreira");
        cliente1.setCpf("222.222.222-22");
        cliente1.setProfissao("Estagiária");

        conta1.setTitular(cliente1); //Estou referenciando que o titular da conta1 é a cliente1.
        System.out.println("O titular da conta " + conta1.getNumero() + " é: "+ conta1.getTitular().getNome());

        //Mostrando que o conta1.titular e o cliente1 fazem referência para o mesmo objeto.
        System.out.println(conta1.getTitular());
        System.out.println(cliente1);

        System.out.println();

        //Criando titular de outra maneira:
        Conta conta2 = new Conta(456,654);

        conta2.setTitular(new Cliente());
        conta2.getTitular().setNome("Giulia Ferreira");
        System.out.println("O titular da conta " + conta2.getNumero() + " é: "+ conta2.getTitular().getNome());





    }
}
