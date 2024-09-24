import java.util.ArrayList;

public class Transacao {
    private ArrayList<Movimento> movimentos;

    public Transacao(){
        movimentos = new ArrayList<Movimento>();
    };

    public void estornarTransacao(){
        
    };
    
    public boolean realizarTransacao(String movimento, Conta conta, float valor, String historico,int operacao){
        Movimento novoMovimento = new Movimento(movimento, conta, valor, historico, operacao);
        try {
            novoMovimento.movimentar();
            movimentos.add(novoMovimento);
            return true;
        } catch (Exception e) {
            return false;
        }
    };

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    public void estornarTransacao(){
        if (!movimentos.isEmpty()) {
            Movimento ultimoMovimento = movimentos.remove(movimentos.size() - 1);
            ultimoMovimento.estornarMovimento();
        }
    }
}
