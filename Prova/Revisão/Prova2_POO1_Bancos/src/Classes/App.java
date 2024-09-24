package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        String usuario, senha;
        char resp;
        boolean flag = true;
        
        List<String> validacao = new ArrayList<>();
        validacao.add("fulano:123");
        validacao.add("beltrano:456");
        validacao.add("ciclano:789");
        
        Transacao t = new Transacao();
        Cliente cl = new Cliente("Clarimundo","99999999999");
        Conta co = new Conta(123456,cl,1000.0f);
        float saldoAnterior = co.getSaldo();       
        
        t.realizarTransacao("02/11/2023", co, "Depósito Dinheiro", 300.0f, Movimento.DEPOSITAR);                
        t.realizarTransacao("02/11/2023", co, "Pagamento Conta de Luz", 5000.0f, Movimento.SACAR);                
        t.realizarTransacao("03/11/2023", co, "Pagamento Conta de Telefone", 120.0f, Movimento.SACAR);                
        t.realizarTransacao("10/11/2023", co, "Recebimento de PIX", 500.0f, Movimento.DEPOSITAR);   
        try{        
            resp = JOptionPane.showInputDialog("Deseja emitir relatório? (s/n)").charAt(0);
            if(resp=='s'||resp=='S'){
                usuario = JOptionPane.showInputDialog("Entre com o usuário");
                senha = JOptionPane.showInputDialog("Entre com a senha");
                for(String s : validacao)
                    if(s.compareTo(usuario+":"+senha)==0){
                        flag = false;    
                        String texto = "Emitindo Extrato da Conta de Número: "+co.getNumero()+
                                "\n\nCorrentista: "+cl.getNome()+"\nCPF: "+cl.getCpf()+
                                "\nSaldo Anterior: "+saldoAnterior+"\n\n";
                        for(Movimento mov : t.getMovimentos())
                          texto += "........................................\nData: "+ mov.getData()+
                                   "\nHistórico: "+ mov.getHistorico()+"\nValor: "+mov.getValor()+
                                   "\nOperação: "+(mov.getOperacao()==Movimento.DEPOSITAR?"Depósito":"Saque")+"\n";
                        texto+="\nSaldo Atual: "+co.getSaldo();
                        JOptionPane.showMessageDialog(null,texto,"RELATÓRIO",1);
                        break;
                    }
                if(flag)    
                    throw new Restricoes("Usuário não autorizado a ver o relatório");
            }                                                 
        }
        catch(Restricoes r){
                JOptionPane.showMessageDialog(null,r.toString(),"RESTRIÇÃO DE IDENTIFICAÇÃO",1);              
        } 
    }
    
}
