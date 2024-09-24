package appsobrecarga2;

import javax.swing.JOptionPane;

public class Adicao2 {
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static float add(float c, float d){
        return c+d;
    }
    
    public static void exibe(int a, int b, int soma){
        JOptionPane.showMessageDialog(null, "A soma de "+a+" e "+b+" vale: "+soma, "Resultado", 1);
    }
    
    public static void exibe(float c, float d, float soma){
        JOptionPane.showMessageDialog(null, "A soma de "+c+" e "+d+" vale: "+soma, "Resultado", 1);
    }
    
}
