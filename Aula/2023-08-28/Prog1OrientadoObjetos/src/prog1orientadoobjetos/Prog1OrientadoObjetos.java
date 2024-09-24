package prog1orientadoobjetos;

import javax.swing.JOptionPane;

public class Prog1OrientadoObjetos {

    public static int le(){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        return num;
    }
    
    public static void main(String[] args) {
        int a, b, s;
        
        a = le();
        b = le();
        SomaDoisInteiros adicao = new SomaDoisInteiros(a,b);        
        s = adicao.soma();
        JOptionPane.showMessageDialog(null,adicao.exibe(s),"SAIDA",1);
        SubtraiDoisInteiros subtracao = new SubtraiDoisInteiros(a,b);        
        s = subtracao.subtrai();
        JOptionPane.showMessageDialog(null,subtracao.exibe(s),"SAIDA",1);
    }
    
}








