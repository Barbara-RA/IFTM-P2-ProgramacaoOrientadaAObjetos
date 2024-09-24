public class Movimento {
    private String data, historico;
    private Conta conta;
    private float valor;
    private int operacao;
    private float saldoAnterior;

    public final static int SACAR = 0;
    public final static int DEPOSITAR = 1;

    public Movimento(String data, String historico, Conta conta, float valor, int operacao, float saldoAnterior) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public boolean movimentar() {
        saldoAnterior = conta.getSaldo();
        if (operacao == conta.sacar(valor)) {
            conta.movimentar(valor, operacao);
            return true;
        } else if (operacao == conta.depositar(valor)) {
            conta.movimentar(valor, operacao);
            return true;
        } else {
            return false;
        }
    }

}
