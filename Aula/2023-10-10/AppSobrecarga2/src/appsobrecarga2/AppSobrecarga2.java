package appsobrecarga2;

import javax.swing.JOptionPane;

public class AppSobrecarga2 {

    public static void main(String[] args) {

        int a=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        Dados1 d1 = new Dados1(a,b);
        int somaInt = Adicao2.add(a, b);
        Adicao2.exibe(a, b, somaInt);
        
        float c = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real:"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número real:"));
        Dados1 d2 = new Dados1(c,d);
        float somaFloat = Adicao2.add(c, d);
        Adicao2.exibe(c, d, somaFloat);  
        
    }
    
}
