public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public Conta(){
    }

    public Conta(int numero, Cliente correntista, float saldo){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public boolean sacar(float valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            Restricoes restricao = new Restricoes();
            return false;
        }
    }


    public boolean movimentar(float valor, int operacao){
        if(operacao == 1){
            depositar(valor);
            return true;
        }else if(operacao == 0){
            sacar(valor);
            return true;
        }else{
            return false;
        }
    }
}
