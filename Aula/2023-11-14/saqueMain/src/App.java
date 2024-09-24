import javax.swing.JOptionPane;

public class App {
    public static double saldo=1000;

    // Exercício 1
    // Faça um programa em java que leia do usuário o valor de um saque a ser feito na conta dele.
    // Em seguida, chame o método “saque”(double-void) que irá verificar se é possível sacar.
    // Caso não haja saldo suficiente, lance uma exceção “IllegalArgumentException”, caso contrário, exiba uma mensagem informando que foi feito o saque no valor especificado.
    // O tratamento dessa exceção será feito no Main.

    // **********Anotações**********:
    // quando a exceção ocorrer na classe, utilize o throws para delegar a responsabilidade de tratamento para a classe que chamou o método.
    // Importante destacar que só utiliza da instrução acima quando a exceção for do tipo Exception.
  
    public static void saque(double valorSaque){
        if(valorSaque>saldo){
            throw new IllegalArgumentException();
        }else{
            saldo-=valorSaque;
            JOptionPane.showMessageDialog(null, "Saque de "+valorSaque+" realizado com sucesso. Saldo atual: "+saldo+".");
        }

    }

    public static void main(String[] args) throws Exception {
       double valorSaque= Double.parseDouble(JOptionPane.showInputDialog("Seu saldo atual é:"+saldo+"\nInforme o valor do saque: "));
       try {
        saque(valorSaque);
       } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Saldo insuficiente");
        
       }
            
    }
}
