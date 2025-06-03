public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public boolean sacar(float valor){
        if(valor<0) return false;
        if(valor>saldo) return false;
        if(saldo==0) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(float valor){
        if(valor < 0) return false;
        if(valor > 10000) return false;
        saldo += valor;
        return true;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta: " + saldo);
    }





}
