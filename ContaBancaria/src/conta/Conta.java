package conta;

public class Conta {

    String nome;
    int codigo;
    
    private double limite = 100;
    private double saldo = 0.0;
    
    
    public void sacar(double valorASacar){
        double saldoFuturo = saldo - valorASacar;
        if(saldoFuturo > limite) {
            saldo = saldoFuturo;
        }
    }
    
    public void depositar(double valorADepositar) {
        saldo += valorADepositar;
    }
    
    public void transferirValor(double valorATransferir, Conta contaDestino) {
        sacar(valorATransferir);
        contaDestino.depositar(valorATransferir);
    }
    
    public double obterSaldo(){
        return saldo;
    }
}
