package Classes;

import javax.swing.JOptionPane;

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
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public boolean sacar(float valor){
        try{
            if(valor <= this.getSaldo()){     
                float x = this.getSaldo() - valor;
                this.setSaldo(x);
                return true;
            }
            else
                throw new Restricao("Saldo Insuficiente para operação de SAQUE");                
        } catch (Restricao r){
            JOptionPane.showMessageDialog(null,r.toString(),"RESTRIÇÃO DE SALDO",1);              
        }
        return false;
    }
    
    public boolean movimentar(float valor, int operacao) {
        if(operacao == 0)
            return this.sacar(valor);
        else
            this.depositar(valor);
        return true;
    }       
    
}




