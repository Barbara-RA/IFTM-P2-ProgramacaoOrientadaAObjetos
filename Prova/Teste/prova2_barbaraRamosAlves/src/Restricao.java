public class Restricao extends Exception {
    private float saque;
    private float saldo;

    public Restricao(float saque, float saldo) {
        super("Saldo insuficiente para saque de " + saque + ". Saldo atual: " + saldo);
        this.saque = saque;
        this.saldo = saldo;
    }

    public Restricao(String string) {
    }

    public float getSaque() {
        return saque;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}