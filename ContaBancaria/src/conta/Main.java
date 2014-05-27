package conta;

public class Main {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.nome = "Robson";
        conta1.codigo = 1;
        conta1.depositar(120.0);
        
        System.out.println("O saldo atual da conta1 é " + conta1.obterSaldo());
        
        Conta conta2 = new Conta();
        conta2.nome = "Fulano de Tal";
        conta2.codigo = 2;
        conta2.depositar(300.0);
        
        System.out.println("O saldo atual da conta2 é " + conta2.obterSaldo());
        
        conta2.transferirValor(100.0, conta1);
        System.out.println("Transferência no valor de 100.0 realizada da conta2 para a conta1. ");
        
        System.out.println("O saldo atual da conta1 é " + conta1.obterSaldo());
        System.out.println("O saldo atual da conta2 é " + conta2.obterSaldo());
    }

}
