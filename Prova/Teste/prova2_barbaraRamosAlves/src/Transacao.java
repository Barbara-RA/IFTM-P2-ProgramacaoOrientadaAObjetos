import java.util.ArrayList;
import java.util.List;

public class Transacao {

    private List<Movimento> movimentos;

    public Transacao() {
        this.movimentos = new ArrayList<>();
    }


    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao) {
        Movimento mov = new Movimento(data, conta, null, historico, valor, operacao);
        if (!mov.movimentar()) {
            return false;
        }
        this.movimentos.add(mov);
        return true;
    }

    public boolean realizarTransacao(String data, Conta conta, Especial especial, String historico, float valor, int operacao) {
        Movimento mov = new Movimento(data, conta, especial, historico, valor, operacao);
        if (!mov.movimentar(especial)) {
            return false;
        }
        this.movimentos.add(mov);
        return true;
    }


    public void estornarTransacao() {
        for (int i = 0; i < this.movimentos.size(); i++) {
            this.movimentos.set(i, null);
        }
        
    }

    public List<Movimento> getMovimentos() {
        return this.movimentos;
    }
}
