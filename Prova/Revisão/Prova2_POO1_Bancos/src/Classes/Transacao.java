package Classes;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    
    private List<Movimento> movimentos;
    
    public Transacao(){      
        this.movimentos = new ArrayList<>();
    }
    
    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao){
        Movimento mov = new Movimento(data,conta,historico,valor,operacao);
        if(!mov.movimentar())
            return false;
        this.movimentos.add(mov);
        return true;
    }
    
    public void estornarTransacao(){
        for(Movimento m : this.movimentos)
            m = null;
    }
    
    public List<Movimento> getMovimentos(){
        return this.movimentos;
    }
}
