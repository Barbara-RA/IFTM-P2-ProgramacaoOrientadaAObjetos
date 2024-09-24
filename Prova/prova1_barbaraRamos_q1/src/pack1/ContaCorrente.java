package pack1;

public class ContaCorrente {
    public String nome;
    public String numeroConta;
    private double saldo;

    public ContaCorrente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        if (saldo > 0 && saque <= saldo) {
            saldo = saldo - saque;
            saldo = saldo - (0.001 * saldo);
        }

    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
        saldo = saldo - (0.001 * saldo);
    }

    public String exibe() {

        return "Nome: " + nome + "\nNúmero da Conta: " + numeroConta + "\nTipo de Conta: Conta Corrente" + "\n Saldo: R$ "
                + saldo;
    }

}
