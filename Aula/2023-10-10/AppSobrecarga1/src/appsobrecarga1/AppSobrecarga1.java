package appsobrecarga1;

import javax.swing.JOptionPane;

public class AppSobrecarga1 {
    
    public static void main(String[] args) {
        // o objeto da classe Adicao1 pode ser criado aqui antes das leitura porque 
        // o construtor dessa classe não depende de dados do usuário
        Adicao1 ad = new Adicao1();  
        
        int a=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        Dados1 d1 = new Dados1(a,b);  // instancia o construtor que trabalha com inteiros lidos do usuário
        int somaInt = ad.addInt(d1.getA(),d1.getB());  // usando o objeto d1
        String texto = ad.exibeInt(d1.getA(), d1.getB(), somaInt);  // usando o objeto d1
        JOptionPane.showMessageDialog(null,texto, "Resultado", 1);
        
        float c = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real:"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número real:"));
        Dados1 d2 = new Dados1(c,d);  // instancia o construtor que trabalha com reais lidos do usuário
        float somaFloat = ad.addFloat(c, d);  // sem usar o objeto d2 (se criou d2, isso não faz muito sentido)
        texto = ad.exibeFloat(c, d, somaFloat);  // sem usar o objeto d2 (se criou d2, isso não faz muito sentido) 
        JOptionPane.showMessageDialog(null,texto , "Resultado", 1);
    }
    
}
