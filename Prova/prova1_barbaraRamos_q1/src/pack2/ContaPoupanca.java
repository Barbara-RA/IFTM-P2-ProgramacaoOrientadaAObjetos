package pack2;

public class ContaPoupanca {
    public String nome;
    public String numeroConta;
    double saldo;
    // verificar e corrigir pq deve ser default

    public ContaPoupanca(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        if (saldo > 0 && saque <= saldo) {
            saldo = saldo - saque;
            saldo = saldo - (0.0005 * saldo);
        }

    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;

    }

    public String exibe() {
        return "Nome: " + nome + "\nNúmero da Conta: " + numeroConta + "\nTipo de Conta: Conta Poupança" + "\n Saldo: R$"
                + saldo;
    }



    
}
