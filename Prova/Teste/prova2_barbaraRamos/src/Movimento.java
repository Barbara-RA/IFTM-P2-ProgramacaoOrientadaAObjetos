public class Movimento {
    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;
    
    final static int SACAR = 0;
    final static int DEPOSITAR = 1;

    public Movimento(String data, Conta conta, Especial especial, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return this.historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getOperacao() {
        return this.operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public float getSaldoAnterior() {
        return this.saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
    
    public boolean movimentar(){
        this.saldoAnterior = this.conta.getSaldo();
        if(this.operacao == SACAR)
            return conta.movimentar(valor, SACAR);
        else if(this.operacao == DEPOSITAR)
            return this.conta.movimentar(valor, DEPOSITAR);
        else
            return false;
    }

    public boolean movimentar(Especial especial){
        this.saldoAnterior = this.conta.getSaldo();
        if(this.operacao == SACAR)
            return conta.movimentar(valor, SACAR, especial);
        else if(this.operacao == DEPOSITAR)
            return this.conta.movimentar(valor, DEPOSITAR, especial);
        else
            return false;
    }
    
}
